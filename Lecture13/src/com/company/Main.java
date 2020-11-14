package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
       int[] arr={1,2,3,4,5,6,7,8};
       int[] wrongArr= {8,5,5,31,5,6,7,3,2,4};

       bubbleSort(wrongArr);
       int k = 3;

      System.out.println(binarySearch(arr,k));
      System.out.println(binarySearch(wrongArr,k));
    }


    public static int binarySearch(int[] data, int key) {
        //{5,10,12,20,22,25,28,30,36,38,40,48}
        int low = 0; // low end of the search area
        int high = data.length - 1; // high end of the search area
        int middle = (low + high + 1) / 2; // middle element
        int location = -1; // return value; -1 if not found

        do { // loop to search for element

            // if the element is found at the middle
            if (key == data[middle]) {
                location = middle; // location is the current middle
            } else if (key < data[middle]) { // middle element is too high
                high = middle - 1; // eliminate the higher half
            } else { // middle element is too low
                low = middle + 1; // eliminate the lower half
            }

            middle = (low + high + 1) / 2; // recalculate the middle
        } while ((low <= high) && (location == -1));

        return location; // return location of search key
    }

    public static void selectionSort(int[] arr) {
        // loop over data.length - 1 elements
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i; // first index of remaining array

            // loop to find index of smallest element
            for (int index = i + 1; index < arr.length; index++)
                if (arr[index] < arr[smallest])
                    smallest = index;


            swap(arr, i, smallest); // swap smallest element into position

        }
    }



    public static void bubbleSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if (arr[j] > arr[j+1]) {
                    int swap=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=swap;
                    System.out.println(Arrays.toString(arr));
                }
            }
        }
    }



    public static void swap(int[] arr, int firstPosition, int secondPosition){
        int swap=0;
        swap=arr[firstPosition];
        arr[firstPosition]=arr[secondPosition];
        arr[secondPosition]=swap;
    }














}

