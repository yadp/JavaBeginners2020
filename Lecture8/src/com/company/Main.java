package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // Scanner scanner = new Scanner(System.in);
        int c = 10;
        int d = 15;
        System.out.println(sumTwoBinaryNumbers(c,d));

    }

    static String sumTwoBinaryNumbers(int a, int b) {

           return Integer.toBinaryString(a) +
                        " + " +
                        Integer.toBinaryString(b) +
                        " = " +
                        Integer.toBinaryString(a + b);
    }

    static void subtractTwoBinaryNumbers(int a, int b) {
        System.out.println(
                Integer.toBinaryString(a) +
                        " - " +
                        Integer.toBinaryString(b) +
                        " = " +
                        Integer.toBinaryString(a - b)
        );
    }





}

/*

 */
/*
int a=41;
        int b=13;
        System.out.println(Integer.toBinaryString(a) + "-" + Integer.toBinaryString(b) + "=" + Integer.toBinaryString(a-b));
       // System.out.println(Integer.toHexString(15));
       // System.out.println(Integer.parseInt("FF",16));
        System.out.println(Integer.parseInt(Integer.toBinaryString(a-b),2));
 */
