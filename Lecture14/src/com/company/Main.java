package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] arr = {1,2,3};
        int[][] arr2 = new int[10][5];



        int[] a = {1,2,3};
        int[] b = {4,5,6};
        int[] c = {7,8,9};

        int[][] array2= {
                {1,2,3},
                {4,5},
                {7,8,9,10}
        };

        System.out.println(Arrays.toString(findMaxForAllColumn(array2)));


    }

    public static int[] findMaxForAllColumn(int[][] array){
        //Create an array to store max values
        int[] maxValues = new int[array[0].length];
            for( int row=0; row<array.length; row++){
                for(int column=0; column<array[row].length; column++){
                if (maxValues[column] < array[row][column]){
                    maxValues[column] = array[row][column];
                }
            }
        }
        return maxValues;
    }

    public static int[] findSumForAllRows(int[][] array){

        int[] sumValues = new int[array.length];

        for( int row=0; row< array.length; row++) {
            int sumOfRow = 0;
            for (int column = 0; column < array[row].length; column++) {
                sumOfRow+=array[row][column];
            }
            sumValues[row]=sumOfRow;
        }
        return sumValues;
    }

    public static int[] findMinForAllRows(int[][] array){
        //Create an array to store max values
        int[] minValues = new int[array.length];

        for( int row=0; row< array.length; row++) {
            int minForRow = array[row][0];
            for (int column = 0; column < array[row].length; column++) {
                if(array[row][column] > minForRow){
                    minForRow=array[row][column];
                }
            }
            minValues[row]=minForRow;
        }
        return minValues;
    }


    public static int[] findMaxForAllRows(int[][] array){
        //Create an array to store max values
        int[] maxValues = new int[array.length];

        //
        for( int row=0; row< array.length; row++) {
            int maxForRow = array[row][0];
            for (int column = 0; column < array[row].length; column++) {
                if(array[row][column]> maxForRow){
                    maxForRow=array[row][column];
                }
            }
            maxValues[row]=maxForRow;
        }
        return maxValues;
    }

    public static int findMaxValue(int[][] array){
        // Find maxNumber
        int max = array[0][0];
        for( int row=0; row< array.length; row++) {
            for( int column=0; column < array[row].length; column++){
                if (array[row][column]> max){
                    max = array[row][column];
                }
            }
        }

        return  max;
    }

    /**
     * Generate random numbers for 2d array
     * @param array we want to fill with values
     */
    public static void randomArray(int[][] array){
        //Generate numbers for this array
        Random random =new Random();
        for( int row=0; row< array.length; row++) {
            for( int column=0; column < array[row].length; column++){
                array[row][column] = random.nextInt(100);
            }
        }
    }

    /**
     * Output content of 2d array
     * @param array we want to print
     */
    public static void outputArray(int[][] array) {
        // loop through array's rows
        for (int row = 0; row < array.length; row++) {
            // loop through columns of current row
            for (int column = 0; column < array[row].length; column++) {
                System.out.print(array[row][column]+"  ");
            }

            System.out.println();
        }
    }
}
