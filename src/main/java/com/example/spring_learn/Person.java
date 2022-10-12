package com.example.spring_learn;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
    /*@Autowired
    @Qualifier("dogBean")*/
    private Pet pet;
    /*@Value("${person.surname}")*/
    private String surname;
    /*@Value("${person.age}")*/
    private int age;


    @Autowired
    public Person(@Qualifier("dogBean") Pet pet) {
        System.out.println(" Person bean is created! ");
        this.pet = pet;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void callYourPet() {
        System.out.println(" Hello my lovely Pet! ");
        pet.say();
    }
}
