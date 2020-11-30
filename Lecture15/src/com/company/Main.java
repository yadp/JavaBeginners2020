package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] array=new int[5];
        System.out.println(Arrays.toString(array));
        fillWithOne(array);
        System.out.println(Arrays.toString(array));

    }

    public static void fillWithOne(int[] array) {
        for (int i=0;i<array.length;i++){
            array[i] = 1;
        }
    }










    /**
     * This ia a test methods
     * @param a takes integer
     */
    public static void testMethod( int a){

    }
}
