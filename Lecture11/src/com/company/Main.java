package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //           0,1,2,3
        int[] arr = {5,6,7,4,5,5,6};

        int[] removeNumber = removeNumber(arr,4);

        System.out.println(Arrays.toString(removeNumber));
    }

    private static int[] removeNumber(int[] arr, int numberToRemove) {
        int[] endArray = new int[arr.length-1];
        boolean meet=false;
        for(int i=0;i<arr.length;i++){
            if(numberToRemove == arr[i] ){
                meet=true;
            } else if ( meet ==true ) {
                endArray[i-1]= arr[i];
            } else {
                endArray[i]= arr[i];
            }
        }
        return endArray;
    }

    public static int findNumberOfEntry(int[] arr, int number) {
        int count = 0;
        for (int nextNumberFromArray: arr) {
            if (nextNumberFromArray == number) {
                count++;
            }
        }
        return count;
    }

    public static int findPositionOfNumber(int[] a, int grape) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == grape) {
                return i;
            }
        }
        return -1;
    }


    public static int sumOfArray(int[] a) {
        int sum = 0;
        for ( int i=0; i<a.length;i++){
            sum=sum+a[i];
        }
        return sum;
    }

    public static int[] copyArray(int[] arr) {
        int[] newArray = new int[arr.length];
        for (int i=0;i<arr.length;i++) {
            newArray[i] = arr[i];
        }
        return newArray;
    }


    public static void addToArray(int[] numbersWeFound, int inputNumber) {
        for (int k=0;k < numbersWeFound.length; k++){
            if (numbersWeFound[k] == 0 ){
                numbersWeFound[k] = inputNumber;
                return;
            }
        }
    }

    public static void removeN(int[] arr, int toRemove){
        for (int i=0;i<arr.length;i++){
            if ( arr[i] == toRemove){
                arr[i]=0;
            }
        }
    }

    public static int numberOfN(int[] a, int n){
        int numbers=0;

        for (int i:a){
            if ( n == i){
                numbers++;
            }
        }
        return numbers;
    }

    /*

    int[] arr={1,2};


        int[] b=  copyArray(arr);

        System.out.println(Arrays.toString(b));

        arr[0]=5;

        System.out.println(Arrays.toString(b));
     */
   /*
   // write your code here
        int[] arr = {3,5,7,9,10,3,5,5};
        int[] numbersWeFound = new int[arr.length]; // {3,5,7,9,10,0,0,0}

        for ( int i: arr){
            if ( numberOfN(numbersWeFound,i)==0 ){
                System.out.println("We found number " + i + " times " + numberOfN(arr, i));
                //add to numbers we found
                addToArray(numbersWeFound,i);
            }
        }

        for ( int k=0;k<arr.length;k++){
            System.out.print(arr[k]+ "  ");
        }
    */


    /*
    public static void main(String[] args) {
        // write your code here
        int[] arr = {3,5,7,9,10,3,5,5};

        System.out.println("We found number "+ 0 + " times "+ numberOfN(arr,0));

        for ( int i: arr){
            // if 0 break;
            if (i == 0){
                break;
            }
            System.out.println("We found number "+ i+ " times "+ numberOfN(arr,i));

            // change all 3 to 0
            while (numberOfN(arr,i)>0){
                //remove i 3
                removeN(arr,i);
            }
        }

        for ( int k=0;k<arr.length;k++){
            System.out.print(arr[k]+ "  ");
        }

    }













    public static void removeN(int[] arr, int toRemove){
        for (int i=0;i<arr.length;i++){
            if ( arr[i] == toRemove){
                arr[i]=0;
            }
        }
    }











    public static int numberOfN(int[] a, int n){
        int numbers=0;

        for (int i:a){
            if ( n == i){
                numbers++;
            }
        }
        return numbers;
    }

     */



















}
