package com.company;

public abstract class Mammal implements Animal {
    public static int count;
    private int age;
    protected String color;
    public String publicString;
    private String[] arr;

    public Mammal(){
        arr=new String[5];
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void test();

    @Override
    public void birth() {
        System.out.println("Give birth mamml ");
    }
}
