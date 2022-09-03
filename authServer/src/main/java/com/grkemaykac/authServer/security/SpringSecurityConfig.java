package com.grkemaykac.authServer.security;

import com.grkemaykac.authServer.jwt.JwtFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.BeanIds;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private JwtFilter jwtFilter;

    @Autowired
    private CustomUserDetailsService userDetailsService;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService);

    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        http.authorizeRequests().antMatchers("/actuator/health").permitAll();//Auth. gerekmeden erişilebilen url'ler.AdminServer'için actuator serbest bırakıldı.
        http.authorizeRequests().antMatchers("/login").permitAll();//Auth. gerekmeden erişilebilen url'ler.
        http.authorizeRequests().antMatchers("/bike/**").access("hasRole('ROLE_admin')"); //admin rolune sahip birinin bu url'e erişebileceğini belirttik.
        http.authorizeRequests().antMatchers("/car/**").access("hasRole('ROLE_client')"); //admin rolune sahip birinin bu url'e erişebileceğini belirttik.
        http.authorizeRequests().anyRequest().authenticated();//Tüm url'ler için authenticationa ihtiyaç duyulmasını sağlar.
        http.sessionManagement();
        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS); //Session oluşturmayı ortadan kaldırıyoruz. Bunu JWT ile sağlayacağız.
        http.addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }

    @Bean(name = BeanIds.AUTHENTICATION_MANAGER)
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }
}
