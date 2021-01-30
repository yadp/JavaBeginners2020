package com.company;

public class Animal extends Object{
    protected int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>=0) {
            this.age = age;
        }
    }

    public void sleep(){
        System.out.println("THis animal is sleeping");
    }
 }
