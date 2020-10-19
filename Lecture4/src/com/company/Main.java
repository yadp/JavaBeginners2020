package com.company;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {


        int randomNum = 1;
        randomNum = ThreadLocalRandom.current().nextInt(1, 3 + 1);
        System.out.println(randomNum);

    }
}







/*

// write your code here
        Scanner sc = new Scanner(System.in);
        int n;
        int sum=0;
        int inputNumber=0;
        System.out.println("How many numbers do you want to sum:");
        n = sc.nextInt();
        //System.out.println("We will sum " + n + "numbers");

        while (n>0) {
            System.out.println("Enter next number:");
            inputNumber = sc.nextInt();
            sum = sum + inputNumber;
            n--;
        }

        System.out.println("Sum is " + sum);
 */



/*
int number =0;

       Scanner sc= new Scanner(System.in);
       boolean continueWhile= true;






        while (continueWhile) {
            System.out.println("Choose one drink from1 to 4( 1 for coffee, 2 for tee, 3 for milk, 4 for watter)");
            number = sc.nextInt();

            switch (number){
                case 1: {
                    String chooseSugar;
                    System.out.println("Choose 1 for sugar, 2 for milk, 3 for clean");
                    chooseSugar= sc.next();
                    switch (chooseSugar){
                        case "sugar":
                            System.out.println("Coffee with sugar");
                            break;
                        case "milk":
                            System.out.println("Coffee with milk");
                            break;
                        case "clean":
                            System.out.println("Clean coffee");
                            break;
                        default:
                            System.out.println("Wrong input. Please start over");
                    }

                    System.out.println("Case 1");
                    break;
                }
                case 2:
                    System.out.println("Case 2");
                    break;
                case 3:
                    System.out.println("Case 3");
                    break;
                case 4:
                    System.out.println("Case 4");
                    break;
                default:
                    System.out.println("Wrong number");
                    continueWhile = false;
            }
        }
 */






/*

 Scanner sc = new Scanner(System.in);
        int month; //1-12
        int day; // 1-31, 1-30 .... 1-28, 1-29
        int year;// All
        System.out.println("Enter your day:");
        day = sc.nextInt();
        System.out.println("Enter your month:");
        month = sc.nextInt();
        System.out.println("Enter your year:");
        year = sc.nextInt();

        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if ( day>= 1 && day<=31){
                    System.out.println("Data is ok");
                } else {
                    System.out.println("Date is not ok");
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if ( day>= 1 && day<=30){
                    System.out.println("Data is ok");
                } else {
                    System.out.println("Date is not ok");
                }
                break;
            case 2:
                if ( year%4 ==0 && !(year%100 == 0 ^ year%400==0)){
                    if (day>=1 && day <=29){
                        System.out.println("Data is ok");
                    } else {
                        System.out.println("Date is not ok");
                    }
                } else {
                    if (day>=1 && day <=28){
                        System.out.println("Data is ok");
                    } else {
                        System.out.println("Date is not ok");
                    }
                }
                break;
            default:
                System.out.println("Data is invalid");
        }
 */





/*


  Scanner sc = new Scanner(System.in);
        int month;
        int day;
        int year;
        System.out.println("Enter your day:");
        day = sc.nextInt();
        System.out.println("Enter your month:");
        month = sc.nextInt();
        System.out.println("Enter your year:");
        year = sc.nextInt();

        if (month>12 || month <1 ){
            System.out.println("Incorrect month");
        } else {
            if (day >= 1) {
                switch (month) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12: {
                        if (day <= 31) {
                            System.out.println("Date is ok");
                        }
                        break;
                    }
                    case 4:
                    case 6:
                    case 9:
                    case 11: {
                        if ( day <= 30) {
                            System.out.println("Date is ok");
                        }
                        break;
                    }
                    case 2:
                        if (year%4==0 && !(year%100==0 ^ year%400==0)){
                            //Leap year
                            if (day<=29){
                                System.out.println("date is ok");
                            } else {
                                System.out.println("date is not ok");
                            }
                        } else {
                            //No leap year
                            if (day<=28){
                                System.out.println("date is ok");
                            } else {
                                System.out.println("date is not ok");
                            }
                        }

                }
            } else {
                System.out.println("Day is not ok");
            }
        }
 */