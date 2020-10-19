package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        boolean lightsOn = false;
        boolean carIsMoving= false;
        boolean seatbel = true;

        if ( carIsMoving ) {
            System.out.println("Car is Moving");
            if ( lightsOn ) {
                System.out.println("Lights are on");
                System.out.println("Perfect");
            }

            if ( !lightsOn ) {
                System.out.println("Lights are off");
                System.out.println("Error!!!");
            }
        }

        if ( carIsMoving == false ) {
            System.out.println("Car is not moving");
            if ( lightsOn ) {
                System.out.println("Lights are on");
            }

            if ( !lightsOn ) {
                System.out.println("Lights are off");
            }
        }





























/*

        boolean lightsOn = false;
        boolean carIsMoving= false;
        boolean seatbel = true;

        if ( carIsMoving ) {
            System.out.println("Car is Moving");
            if ( lightsOn ) {
                System.out.println("Lights are on");
                System.out.println("Perfect");
            }

            if ( !lightsOn ) {
                System.out.println("Lights are off");
                System.out.println("Error!!!");
            }
        }

        if ( carIsMoving == false ) {
            System.out.println("Car is not moving");
            if ( lightsOn ) {
                System.out.println("Lights are on");
            }

            if ( !lightsOn ) {
                System.out.println("Lights are off");
            }
        }


        if ( carIsMoving == true )
            System.out.println("TEST");














            System.out.println("TEST2");


*/




    }

}
