package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ExampleSort exampleSort = new ExampleSort(new ArrayList<>());

        exampleSort.addInt(5);
        exampleSort.addInt(6);
        exampleSort.addInt(3);
        exampleSort.addInt(8);

        exampleSort.sortList();

        System.out.println(exampleSort);


    }

    public static void exampleNoParam(){
        System.out.println("This is a test without param");
    }

    public static void printList(List<String> testList){
        testList.forEach(oneString -> System.out.println(oneString));
    }
}
