package com.example.spring_learn;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("dogBean")
//@Scope("prototype")
public class Dog implements Pet {
    public Dog() {
        System.out.println(" Dog bean is created! ");
    }

    @Override
    public void say() {
        System.out.println(" Beow - Weow ");
    }

    @PostConstruct
    public void init() {
        System.out.println(" Class Dog: init-method ");
    }

    @PreDestroy
    public void destroy() {
        System.out.println(" Class Dog: destroy-method ");
    }
}
