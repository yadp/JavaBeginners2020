package com.company;

public class Dog {

    public String name;
    public int age;
    public String color;

    public Dog() {
        System.out.println("This is dog constructor");
        age=1;
        name="Name";
    }

    public Dog(String constrName){
       name=constrName;
    }

    public Dog(String name,int age, String color){
        this.name=name;
        this.age=age;
        this.color=color;
    }

    public void run(){

        System.out.println("Dog is running");
    }

    //sleep
    //int minute
    public void sleep(int minute){

        System.out.println("Dog is sleeping for "+ minute);
    }


    @Override
    public String toString() {
        return "This is " +name + " and it is " + age + " years old "+
                "and has " + color + " hair";
    }
}
