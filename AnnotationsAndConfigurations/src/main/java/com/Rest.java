package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rest {
    @Autowired
    private ApplicationContext context;
    @GetMapping("get")
    public void get()
    {
        System.out.println("get");
        beanModel BeanModel = (beanModel) context.getBean("data2");
        System.out.println(BeanModel.name);
    }
}
