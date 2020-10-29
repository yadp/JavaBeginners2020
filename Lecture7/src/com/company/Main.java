package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        sum(5,6);


    }


    /**
     * This is method for sum of 2 numbers
     * @param a  first number
     * @param b  second number
     * @return sum of both numbers
     */
    public static int sum(int a,int b){
        return a+b;
    }















    public static void firstMehtod(int a, int b){
        System.out.println(a);
    }
}


/*

 // write your code here
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        boolean hasNumber = false;
        boolean hasUpperLetter = false;
        boolean hasLowerLetter = false;

        if (password.length() >= 8) {
            //Password length is ok
            for (int i = 0; i < password.length(); i++) {
                System.out.println(password.charAt(i));
                char letter = password.charAt(i);
                if ((int) letter >= 48 && (int) letter <= 57) {
                    System.out.println("This is a number");
                    hasNumber = true;

                }

                if ((int) letter >= 65 && (int) letter <= 90) {
                    System.out.println("This is Upper case");
                    hasUpperLetter = true;
                }

                if ((int) letter >= 97 && (int) letter <= 122) {
                    System.out.println("This is lower case");
                    hasLowerLetter = true;
                }
            }
            if (hasNumber && hasLowerLetter && hasUpperLetter) {
                System.out.println("Password is ok");
            }
        } else {
            System.out.println("Password is invalid");
        }
 */
/*
 Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int saveOriginalNumber =number;
        int reverseNumber = 0;

        for (;number>10;){
            int digit = number%10;
            reverseNumber=digit + reverseNumber*10;
            number = number/10;
        }
        reverseNumber= number + reverseNumber*10;
        System.out.println("Original number is " + saveOriginalNumber);

        System.out.println("Reverse number is: " + reverseNumber);

        if ( reverseNumber == saveOriginalNumber ){
            System.out.println("Number is palindrome");
        } else {
            System.out.println("Number is not palindrome");
        }
 */
/*
 Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        boolean isPrime = true;
        int number = scan.nextInt();

        System.out.println("This is a prime number 1");
        for (int i = 2; i <= number; i++) {
            isPrime = true;
            int n = i;
            for (int j = 2; j < n; j++) {
                if (n % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime == true) {
                System.out.println("This is a prime number " + n);
            }
        }
 */
