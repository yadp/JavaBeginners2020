package com.company;

public class StaticDemo {
    private static int counter=0;

    public static int getCounter() {
        return counter;
    }

    private int number;
    private Teacher bobi;

    private static int secondNumber;

    public StaticDemo(){
        counter++;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public static int getSecondNumber() {
        return secondNumber;
    }

    public static void setSecondNumber(int secondNumber) {
        StaticDemo.secondNumber = secondNumber;
    }
}
