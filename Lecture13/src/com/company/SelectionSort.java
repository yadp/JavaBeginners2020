package com.company;

public class SelectionSort {

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

    public static void swap(int[] data, int first, int second) {
        int temporary = data[first]; // store first in temporary
        data[first] = data[second]; // replace first with second
        data[second] = temporary; // put temporary in second
    }
}
