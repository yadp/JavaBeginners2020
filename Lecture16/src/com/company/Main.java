package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Dog sharo;
        sharo = new Dog("Sharo",3,"red");
        System.out.println(sharo.toString());

        sharo.age=-3;
        System.out.println(sharo.toString());

    }
}
