package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code her

        Animal exampleAnimal;
        exampleAnimal = new Dog();

        exampleAnimal.sleep();




        Animal[] zoo=new Animal[3];

        zoo[0]= new Dog();
        zoo[1]= new Mammal();
        zoo[2]= new Cat();

        zoo[0].sleep();

        for (int i = 0; i < zoo.length; i++) {
            zoo[i].sleep();
        }







    }

    /*
    Animal exampleAnimal;
        exampleAnimal = new Animal();

        Dog bobi= new Dog();



        exampleAnimal.sleep();

        bobi.walk();

        bobi.sleep();

        System.out.println(bobi);

        exampleAnimal.setAge(1);
        bobi.setAge(15);

        System.out.println(exampleAnimal.getAge());
        System.out.println(bobi.getAge());

        Mammal mammalExample= new Mammal();
        mammalExample.sleep();

        bobi.number=5;
     */

    /*
    Teacher bobi = new Teacher("Bobi");
        Teacher ted =new Teacher("Ted");

        Lesson lesson= new Lesson();
        lesson.setTeacherOfThisLesson(ted);

        System.out.println(lesson.getTeacherOfThisLesson().getName());
        //
        lesson.setTeacherOfThisLesson(bobi);

        System.out.println(lesson.getTeacherOfThisLesson().getName());
     */


    /*StaticDemo exampleObject = new StaticDemo();
        StaticDemo secondExample = new StaticDemo();

        exampleObject.setNumber(1);
        secondExample.setNumber(5);

        System.out.println("Example object number "+ exampleObject.getNumber());
        System.out.println("Second example object number "+ secondExample.getNumber());

        exampleObject.setSecondNumber(3);
        System.out.println("Second nnumber for example is "+ exampleObject.getSecondNumber());
        System.out.println("Second number for second example is "+ secondExample.getSecondNumber());


        secondExample.setSecondNumber(10);
        System.out.println("Second nnumber for example is "+ exampleObject.getSecondNumber());
        System.out.println("Second number for second example is "+ secondExample.getSecondNumber());


        StaticDemo.setSecondNumber(15);
        System.out.println("Second nnumber for example is "+ exampleObject.getSecondNumber());
        System.out.println("Second number for second example is "+ secondExample.getSecondNumber());


        System.out.println("StaticDemo has "+ StaticDemo.getCounter()+ " number of objects");*/
}
