package com.company;

public class Group {

    private static int studentInSchool=0;
    private int numberOfStudent;
    private Teacher teacher;
    private String name;

    public Group(int numberOfStudent, Teacher teacher) {
        this.numberOfStudent = numberOfStudent;
        studentInSchool+=numberOfStudent;
        this.teacher= teacher;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public int getNumberOfStudent() {
        return numberOfStudent;
    }

    public void addStudents(int numberOfStudent){
        this.numberOfStudent+=numberOfStudent;
        studentInSchool+=numberOfStudent;
    }


    public static int getStudentInSchool() {
        return studentInSchool;
    }

}
