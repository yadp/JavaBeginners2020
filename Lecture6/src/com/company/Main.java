package com.company;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int kiloToBuy= scan.nextInt();

        int result = buyOrange(kiloToBuy);
        System.out.println("Final Price is:" + result);
    }

    static int buyOrange(int kilo){
        int endPrice = 0;
        endPrice = kilo * 3 + 1;
        return endPrice;
    }

    static int incrementByOne(int inputNumber){
        inputNumber = inputNumber + 1;
        return inputNumber;
    }

    static void firstMethodWithParameter(int inputNumber){
        System.out.println("First Parameter Value is "+inputNumber);
    }



    static void testMethod(){
        System.out.println("This is a test method");
    }

}

/*
    //Homework from last week ( lecture 4)
 //random input from computer
        int inputComputer=1;
        // input from user
        int inputUser =1;
        //Counter for user wins
        int userWins= 0;

        //Counter for computer wins
        int compWins=0;
        Scanner scan= new Scanner(System.in);


        while (true){
            System.out.println("Enter your move \n 1) Rock \n 2) Seciours \n 3) Paper");

            inputUser = scan.nextInt();
            inputComputer = ThreadLocalRandom.current().nextInt(1, 3 + 1);

            System.out.println("User input is: " + inputUser +"\nInput of comp is:" + inputComputer);
            switch (inputUser){
                case 1://user
                    switch (inputComputer){
                        case 1://comp
                            System.out.println("Draw");
                            break;
                        case 2:
                            System.out.println("User wins");
                            userWins++;
                            break;
                        case 3:
                            System.out.println("Comp wins");
                            compWins++;
                            break;

                    }
                    break;
                case 2:
                    switch (inputComputer){
                        case 1:
                            System.out.println("Comp wins");
                            compWins++;
                            break;
                        case 2:
                            System.out.println("Draw");
                            break;
                        case 3:
                            System.out.println("User wins");
                            userWins++;
                            break;

                    }
                    break;
                case 3:
                    switch (inputComputer){
                        case 1:
                            System.out.println("User wins");
                            userWins++;
                            break;
                        case 2:
                            System.out.println("Comp wins");
                            compWins++;
                            break;
                        case 3:
                            System.out.println("Draw");
                            break;
                    }
                default:
                    System.out.println("Wrong input");

            }

            System.out.println("User has "+ userWins+ "wins \n"+ "Comp has" + compWins + "wins \n" );
            if ( userWins + compWins >=5 ){
                System.out.println("End Of the game");
                break;
            }
        }

 */

/*
 int userWon=0;
	    int computerWon=0;
	    int computerChoice = 1;//ThreadLocalRandom.current().nextInt(1, 3 + 1);
        int playerChoice = 1;
        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.println("Please choose: \n1)Rock\n 2)Scissors\n 3) Paper ");
            playerChoice = scan.nextInt();
            computerChoice = ThreadLocalRandom.current().nextInt(1, 3 + 1);

            switch (playerChoice){
                case 1:
                    switch (computerChoice){
                        case 1:
                            System.out.println("You have chosen Rock and Computer have chosen rock");
                            System.out.println("It is a draw");
                    }
                    break;
                case 2:
                case 3:
                default:
                    System.out.println("This is wrong input");
                    break;
            }
            System.out.println("Computer score is "+ computerWon+ " \n Your score is "+ userWon);
            if (computerWon + userWon >=5){
                System.out.println("End of Game");
                break;
            }
        }

 */
