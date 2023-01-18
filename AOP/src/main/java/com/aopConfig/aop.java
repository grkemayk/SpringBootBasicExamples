package com.aopConfig;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class aop {
    /*@Before("execution(* com.controller.aopCOntroller.*(..)) && @annotation(sampleAnnotation)")
    public void before1(JoinPoint jp, myAn sampleAnnotation){
        System.out.println(sampleAnnotation.name());
        System.out.println("before method");
    }*/

    /*@After("execution(* com.controller.aopCOntroller.*(..)) && @annotation(sampleAnnotation)")
    public void after1(JoinPoint jp, myAn sampleAnnotation){
        System.out.println(sampleAnnotation.name());
        System.out.println("before method");
    }*/

    /*@Around("execution(* com.controller.aopCOntroller.*(..)) && @annotation(sampleAnnotation)")
    public void around1(ProceedingJoinPoint jp, myAn sampleAnnotation) throws Throwable {//ProceedingJoinPoint.proceed() return value'yu alır.
        System.out.println(jp.proceed());
        System.out.println(sampleAnnotation.name());
        System.out.println("after method");
    }*/

    /*@AfterReturning("execution(* com.controller.aopCOntroller.*(..))")
    public void afterReturning1(JoinPoint jp){//ProceedingJoinPoint.proceed() return value'yu alır.
        System.out.println("after method");
    }*/

    /*@AfterThrowing("execution(* com.controller.aopCOntroller.*(..))")
    public void afterThrowing1(JoinPoint jp){//ProceedingJoinPoint.proceed() return value'yu alır.
        System.out.println("after method");
    }*/
}
