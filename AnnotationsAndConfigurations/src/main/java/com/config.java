package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class config {


    @Bean(name = "data")
    public void data()
    {
        System.out.println("void bean");
    }
    @Bean(name = "data2")
    public beanModel data2()
    {
        System.out.println("data2");
        return new beanModel();
    }
}
