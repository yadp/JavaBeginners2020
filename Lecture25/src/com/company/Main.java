package com.company;


import java.util.*;

public class Main {

    /**
     * This is the main method
     * @param args
     */
    public static void main(String[] args) {
        // write your code here


        Stack<Student> student= new Stack<>();
        System.out.println(student);
        student.push(new Student("Student X"));
        student.push(new Student("Student Y"));

        System.out.println(student);

        System.out.println(student.peek());//Y
        System.out.println(student.pop());//Y
        System.out.println(student.pop());//X

        System.out.println(student.isEmpty());
        System.out.println(student);

        Queue<String> queue= new ArrayDeque<>(1);
        queue.add("TestFirst");
        queue.add("TestLast");


        System.out.println(queue.peek());
        System.out.println(queue);

        System.out.println(queue.poll());
        System.out.println(queue);

























       /* LinkedList<String> list = new LinkedList<>();
        list.addFirst("test");

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.trimToSize();

        List<Student> studentList = new ArrayList<>();
        System.out.println(studentList.isEmpty());
        if (studentList.isEmpty()) {

        }

        studentList.add(new Student("Student X"));
        studentList.add(new Student("Student Y"));
        studentList.add(0, new Student("Student Z"));
        System.out.println(studentList.isEmpty());

        Student foundStudent = studentList.get(2);
        System.out.println(foundStudent.getName());
        System.out.println(studentList);

        Student removedStudent = studentList.remove(2);
        System.out.println(removedStudent.getName());
        System.out.println(studentList);

        Student studentX = studentList.get(1);
        studentList.add(studentX);
        studentList.add(studentX);
        System.out.println(studentList);

        studentList.remove(studentX);
        System.out.println(studentList);

        for (int i = 0; i < studentList.size(); i++) {
            if ("Student Z".equals(studentList.get(i).getName())) {
                studentList.get(i);
            }
        }

        studentList.contains(studentX);


        Student[] array = new Student[5];

        for (int i = 0; i < array.length; i++) {

        }

        Student[] array2 = new Student[array.length * 2];

        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i];

        }

        array[0] = new Student("Student1");
        array[1] = new Student("Student2");

        array[0] = new Student("Student 3");
        //add elements to the array


        System.out.println(Arrays.toString(array));
*/

    }
}
