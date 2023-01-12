package com.aopConfig;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class aop {
    @Before("execution(* com.controller.aopCOntroller.*(..)) && @annotation(sampleAnnotation)")
    public void before1(JoinPoint jp, myAn sampleAnnotation){
        System.out.println(sampleAnnotation.name());
        System.out.println("before method");
    }
    @Around("execution(* com.controller.aopCOntroller.*(..)) && @annotation(sampleAnnotation)")
    public void before2(ProceedingJoinPoint jp, myAn sampleAnnotation) throws Throwable {//ProceedingJoinPoint.proceed() return value'yu alır.
        System.out.println(jp.proceed());
        System.out.println(sampleAnnotation.name());
        System.out.println("after method");
    }
}
