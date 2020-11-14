package com.company;

public class BinarySearch {

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
}
