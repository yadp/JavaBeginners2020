package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        for ( int i=1;i<=5;i++){//3
            if ( i == 3){
                continue;
            }
            System.out.println(i);
        }

    }
}


/*
 Scanner scan= new Scanner(System.in);
        System.out.println("Enter number:");

        boolean isPrime=true;

        int n = scan.nextInt();//n=13

        for(int i=2;i<n;i++){//i=1

            if ( n%i == 0 ){
                isPrime=false;
            }

        }

        System.out.println("The number is prime: " + isPrime);
 */

/*
 Scanner scan = new Scanner(System.in);

        System.out.println("How many numbers do you want?");
        int n = scan.nextInt();//2
        int sum = 0;
        int maxValue;

        System.out.println("Next number:");
        int inputNumber= scan.nextInt();//3
        sum = sum + inputNumber;
        maxValue = inputNumber;//3


        for (int i=0;i<n-1;i++){//1
            System.out.println("Next number:");
            inputNumber= scan.nextInt();//3
            sum = sum + inputNumber;

            if ( inputNumber > maxValue) {
                maxValue = inputNumber;//3
            }

        }
        System.out.println("Max value is "+ maxValue);
        //System.out.println("Sum is " + sum);
 */