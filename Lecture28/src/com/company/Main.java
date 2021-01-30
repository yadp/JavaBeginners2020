package com.company;

import java.beans.FeatureDescriptor;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class Main {

    public static void main(String[] args) throws Exception {
        /*Student bobi = null;

        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(""));
            String line;

            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }

        } catch (Exception e) {
            System.out.println("Code inside Catch");
            throw new Exception();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Finally");
        }

        in.close();*/

        File f2 = new File("..\\Lecture28\\demo.txt");
        try (PrintWriter out =
                     new PrintWriter(new BufferedWriter(new FileWriter(f2)))) {
            out.println("## Automatically generated config file. DO NOT EDIT djsakdjajkds");
            // ...
        } catch (IOException iox) {
            // Handle exceptions
        }

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("demo.txt"))){
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        }catch (Exception e){
            e.printStackTrace();
            System.out.println("This file dosen't exist");
        }


        System.out.println(f2.getPath());
        System.out.println(f2.getAbsolutePath());
        System.out.println(f2.getCanonicalPath());

        File fileSecodn= new File("test.txt");

        Files.copy(f2.toPath(),fileSecodn.toPath(), StandardCopyOption.REPLACE_EXISTING);
/*
        // write your code here
        String test = null;
        try {
            System.out.println(test.toLowerCase());
        } catch (NullPointerException e) {
            e.printStackTrace();
            e.getMessage();
        }

        *//**
         * Class Student  - private Age & Name
         *
         * Exception NullStudentName
         *
         * Throw NullStudentName getName();
         *
         * New Object Student
         *
         * Catch NullStudentName
         *
         *//*


        try {
            bobi.getName();
        } catch (NullStudentName nullStudentName) {
            System.out.println("Student Bobi doesn't have a name yet");
            nullStudentName.printStackTrace();
        } catch (NullPointerException nullPointerException) {
            nullPointerException.printStackTrace();
        } catch (Exception e) {
            System.out.println("Exception e");
            e.printStackTrace();
        }


        *//*int number1=15;
        int number2=0;
        try {
            System.out.println(dev(number1, number2));
        } catch (ArithmeticException e){
            System.out.println("We are inside the catch");
            number2 = 3;
            dev(number1,number2);
        }*/
    }

    public static int dev(int a, int b) throws ArithmeticException {

        if(b == 0){
            throw new ArithmeticException();
        }

        System.out.println("We don't see this message");
        return a/b;
    }
}
