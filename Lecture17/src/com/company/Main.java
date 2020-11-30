package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int a = 0;
        System.out.println(a);
        Teacher bobi = new Teacher("Bobi");
        System.out.println(bobi.name);

        Teacher[] teachers = new Teacher[3];
        for (int i = 0; i <2; i++) {
            teachers[i]= new Teacher("Teacher" + i , new Random().nextInt(100));
        }
        teachers[2]=null;




        teachers[0] = bobi;


        System.out.println(Arrays.toString(teachers));

        for (int i = 0; i < teachers.length; i++) {
            if (teachers[i] == null) {
                System.out.println("Teacher is null");
            } else {
                System.out.println(teachers[i].toString());
            }
        }

        System.out.println(findMinAge(teachers));




        /*double sumOfArray=0;
        int[] arr= new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i]=new Random().nextInt();
            sumOfArray=sumOfArray+arr[i];
        }
        System.out.println("Sum of numbers is "+ sumOfArray);
        System.out.println("Avg is "+ sumOfArray/arr.length);



        Teacher[] teachers =new Teacher[10];

        double sum=0;

        for (int i = 0; i <10; i++) {
            teachers[i]= new Teacher("Teacher" + i , new Random().nextInt(100));
            sum= sum + teachers[i].age;
        }

        System.out.println("Sum of age of all teachers is " + sum);
        System.out.println("Avg age of teachers "+ sum/teachers.length);

        System.out.println(Arrays.toString(teachers));

        System.out.println("Min age teacher is " + findMinAge(teachers));*/

    }


    public static Teacher findMinAge(Teacher[] teachers) {
        Teacher minAgeTeacher = teachers[0];

        for (int i = 0; i < teachers.length; i++) {
            if (teachers[i]!=null && teachers[i].age< minAgeTeacher.age) {
                minAgeTeacher = teachers[i];
            }
        }
        return minAgeTeacher;
    }


    public int getRandomNumberUsingNextInt(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }
}
