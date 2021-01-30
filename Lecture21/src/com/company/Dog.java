package com.company;

public class Dog extends Mammal{
    protected int number;


    public Dog(){

    }

    public void walk(){
        System.out.println("This dog is walking");
    }

    public void walk(int steps){
        System.out.println("Dog is walking" + steps);
    }

    public void walk(String text){

    }

    @Override
    public void sleep() {
        System.out.println("This is a dog");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "number=" + number +
                '}';
    }
}
