package com.example.spring_learn;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnotation {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();

        System.out.println(person.getSurname());
        System.out.println(person.getAge());


        /*Cat cat = context.getBean("catBean", Cat.class);
        cat.say();

        Dog dog = context.getBean("dogBean", Dog.class);
        dog.say();*/

        context.close();
    }
}
