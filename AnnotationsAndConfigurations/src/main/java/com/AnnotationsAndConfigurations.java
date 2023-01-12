package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AnnotationsAndConfigurations {

    public static void main(String[] args) {
        System.out.println("1");
        SpringApplication.run(AnnotationsAndConfigurations.class, args);
        enumEx Enum = enumEx.valueOf("low");
        System.out.println(Enum.label);
    }
}
