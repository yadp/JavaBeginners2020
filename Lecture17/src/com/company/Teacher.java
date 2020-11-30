package com.company;

public class Teacher {
    String name;
    int age;

    public Teacher(){

    }

    public Teacher(String name){
        this.name = name;
    }

    public Teacher(String name, int age){
        this.name = name;
        this.age = age;
    }


    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
