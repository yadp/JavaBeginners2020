package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {



    public static void main(String[] args) {

        String text= new String("test");
        Teacher bobi = new Teacher("Bobi",30,100);

        Teacher ted =new Teacher("Ted",28,102);

        bobi.equals(ted);


        /*
        System.out.println("Bobi is " +  bobi.getAge());

        System.out.println("Bobi works inside " + bobi.getRoom());
        System.out.println(bobi);

        bobi.setRoom(105);

        System.out.println(bobi);

        System.out.println("Bobi works inside " + bobi.getRoom());

        System.out.println(Arrays.toString(bobi.getLessons()));

        bobi.addLesson("Math");
        bobi.addLesson("History");

        System.out.println(Arrays.toString(bobi.getLessons()));

        bobi.removeLesson(new String("Math"));
        bobi.removeLesson("History");

        System.out.println(Arrays.toString(bobi.getLessons()));
*/













	// write your code here

        Teacher[] teachers= new Teacher[3];

        for (int i = 0; i < teachers.length; i++) {
            teachers[i]=new Teacher("teacher"+i, 30, new Random().nextInt(1000));
        }

        //System.out.println(Arrays.toString(teachers));






    }
}
