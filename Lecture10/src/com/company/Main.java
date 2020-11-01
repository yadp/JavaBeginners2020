package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr= {12,2,3,45,4,6453};
        for (int i=0;i<arr.length;i++){

            System.out.println(arr[i]);
        }
        
        for(int number:arr){
            System.out.println(number);
        }



    }
    public static int findMax(int[] arr) {
        int max= arr[0];
        for(int i=0;i<arr.length; i++){
            if (max < arr[i]){
                max= arr[i];
            }
        }
        return max;
    }

    public static int findMin(int[] arr) {
        int min= arr[0];
        for(int i=0;i<arr.length; i++){
            if (min > arr[i]){
                min= arr[i];
            }
        }
        return min;
    }

    /*
     int[] array = {100,20,13};


        Scanner sc = new Scanner(System.in);
        System.out.println("Tell us the length of an array");
        int arrayLength = sc.nextInt();

        int[] arr = new int[arrayLength];

        for ( int i=0; i<arr.length; i++){
            System.out.println("Next number");
            arr[i] = sc.nextInt();
        }

        System.out.println("Your numbers are:");
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+"  ");
        }

        System.out.println("Sum of numbers is: "+sum(arr));

        System.out.println("Average is: "+ average(arr));

        System.out.println("Please enter number to check:");
        int numberToCheck = sc.nextInt();
        System.out.println("Array contains "+ numberToCheck + " on position "+ position(arr, numberToCheck));
     */

    /**
     *
     * @param arr array
     * @param number number we are searching for
     * @return -1 if number doesnt exist if else the position of the number
     */
    public static int position( int[] arr, int number){
        for(int i=0;i<arr.length;i++){
            if (arr[i]==number){
                return i;
            }
        }
        return -1;
    }


    public static boolean contains( int[] arr, int number){
        for(int i=0;i<arr.length;i++){
            if (arr[i]==number){
                return true;
            }
        }
        return false;
    }

    public static int average(int[] arr) {
        return sum(arr)/arr.length;
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i=0; i<arr.length ; i++){
            sum = sum + arr[i];
        }
        return sum;
    }

    static void arrayMethod(){
        //0, 1, 2
        int[] arr = {100,50,70};

        double sum=0;

        System.out.println("This is array length " + arr.length);

        for (int i=0; i<arr.length ; i++){
            sum = sum + arr[i];
            System.out.println("This is the number:" + arr[i]);
            System.out.println("This is the sum:" + sum);
        }

        double average = sum/arr.length;

        System.out.println(average);
    }

















    static boolean isPalindrome( String stringToTest ){
        int begining=0;
        int end = stringToTest.length()-1;
        while (begining < end){
            if (stringToTest.charAt(begining++) != stringToTest.charAt(end--)){
                return false;
            }
        }
        return true;
    }



}
