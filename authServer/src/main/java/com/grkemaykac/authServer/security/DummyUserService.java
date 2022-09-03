package com.grkemaykac.authServer.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DummyUserService {

    private Map<String, User> users = new HashMap<>();

    @PostConstruct
    public void initialize() {
        List<GrantedAuthority> xArrayRolesAdmin = new ArrayList<GrantedAuthority>();
        xArrayRolesAdmin.add(new SimpleGrantedAuthority("ROLE_admin"));//Role eklerken ROLE_ keyword'u kullanılmalı
        users.put("admin", new User("admin", "admin123",xArrayRolesAdmin));

        List<GrantedAuthority> xArrayRolesClient = new ArrayList<GrantedAuthority>();
        xArrayRolesClient.add(new SimpleGrantedAuthority("ROLE_client"));//Role eklerken ROLE_ kalıbı kullanılmalı
        users.put("client", new User("client", "client123",xArrayRolesClient));

        users.put("grkem", new User("grkem", "grkem123",new ArrayList<>()));
    }

    public User getUserByUsername(String username) {
        return users.get(username);
    }
}
