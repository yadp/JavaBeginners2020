package com.company;

import com.company.example.C;

import java.util.*;


public class Main {

    public static void main(String[] args) {
	// write your code here
        int a = ImplementClassA.CONST;
        C test=new C();

        InterfaceExample interfaceExample= new InterfaceExample() {
            @Override
            public void exampleMethod() {
                System.out.println("test");
            }
        };

        interfaceExample.exampleMethod();


        System.out.println(Arrays.toString(Day.values()));

        Day dayToTest = Day.valueOf("Monday");

        switch (dayToTest){
            case Monday:{

            }
            case Tuesday:{

            }
            default:{

            }

        }


    }





}
