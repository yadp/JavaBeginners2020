package com.company;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;


public class Main {

    public static void main(String[] args) {
	// write your code here
       int[] a= {1,5,2,3,8,13,2}; // 1,2,2,3,5,8,13
       int[] b ={1,2,2,3,5,8,13};


       int c=3;
       int d=4;
       int swap=c;//3
       c=d;//c =4
       d=swap;//d =3
        System.out.println(Arrays.toString(a));
        sort(a);
        System.out.println(Arrays.toString(a));





    }

    public static void sort(int[] arr){
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if (arr[j] > arr[j+1]) {
                    int swap=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=swap;
                }

            }
            System.out.println(Arrays.toString(arr));
        }
    }

    private static int power(int n, int k) {
        if(k==1){
            return n;
        }
        return power(n,k-1) * n;
    }

    //Factorial
    //0!= 1
    //1!=1
    //2! =1*2
    //3! = 1*2*3


    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return factorial(n - 1) * n;

    }

    /*
    int a=539182723;
        int b=372823173;

        System.out.print(a+b);
        //Find sum of all numbers
        //int[] arr= {2,5,32,5,665,3,4,5};
        Date date= new Date();
        System.out.println(date.getTime());

        int[] arr=randomArray(10000000);
        System.out.println(Arrays.toString(arr));
        System.out.println(findSum(arr));

        Date dateend= new Date();
        System.out.println(dateend.getTime());

        long result=dateend.getTime() - date.getTime();

        System.out.println("Delta "+ result);
     */

    public static int[] randomArray(int n){
        int[] arr= new int[n];
        Random random=new Random();
        for(int i=0;i<arr.length;i++){
            arr[i]=random.nextInt(100);
        }
        return arr;
    }

    public static boolean isThereSumOfthree(int[] arr) {
        for(int i:arr){
            if(isThereSum(arr,i)){
                return true;
            }
        }
        return false;
    }

    public static boolean isThereSum(int[] arr, int k) {
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                if(arr[i]+arr[j]==k && i!=j){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean contains(int[] arr, int k){
        int counter=0;
        for(int i:arr){
            if(i==k){
                counter++;
            }
        }
        return false;
    }

    public static int findSum(int[] arr){
        int sum = 0;
        for (int i:arr){
            sum+=i;
        }
        return sum;
    }
}
