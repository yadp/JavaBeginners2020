package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //       0,1,2,3,4 ,5
    int arr[] = {1,2,3,4,66,77};

    System.out.println("Length of the array is " + arr.length);

    for (int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }

    System.out.println(arr[0]);
                              //6-1
    System.out.println(arr[arr.length-1]);



    }

    /*
     //    H B S

        // &  0 0 1 = 1
        // |  1 1 1 = 7
        //    1 0 1 = 5
        //    0 1 1 = 3
        // ^  1 1 0 = 6
        int invA = 5;
        int invB = 3;

        System.out.println(invA&invB);

        System.out.println(invA|invB);

        System.out.println(invA^invB);

        System.out.println(~invA);
     */
}
