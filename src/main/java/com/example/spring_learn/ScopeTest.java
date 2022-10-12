package com.example.spring_learn;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Dog dog_1 = context.getBean("dogBean", Dog.class);
        dog_1.say();

        context.close();
    }
}
