package com.controller;

import com.aopConfig.myAn;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aop")
public class aopCOntroller {
    @PostMapping("/aop1")
    @myAn(name = "aop1")
    public String aop1(){
        System.out.println("method");
        return "Success";
    }
    @PostMapping("/aop2")
    @myAn(name= "aop2")
    public String aop2(){
        System.out.println("method");
        return "Success";
    }
}
