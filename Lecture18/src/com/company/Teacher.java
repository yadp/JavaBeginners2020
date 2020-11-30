package com.company;

import java.util.Arrays;
import java.util.Objects;

public class Teacher {
    private String name;
    private int age;
    private int room;
    private String[] lessons;
    private int countLessons;


    public Teacher(){
        lessons=new String[5];
    }

    public Teacher(String name){
        lessons=new String[5];
        this.name = name;
    }

    public Teacher(String name, int age){
        lessons=new String[5];
        this.name = name;
        this.age = age;
    }

    public Teacher(String name, int age, int room){
        lessons=new String[5];
        this.room=room;
        this.name=name;
        this.age=age;
    }

    public Teacher(String name, int age, int room, String lesson){
        this.room=room;
        this.name=name;
        this.age=age;
        this.lessons=new String[5];
        this.lessons[0]= lesson;
    }

    public String[] getLessons(){
        return this.lessons;
    }

    public void setLessons(String[] lessons){
        this.lessons=lessons;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age=age;
    }



    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name=name;
    }


    public int getRoom(){
        return room;
    }

    public void setRoom(int room){
        this.room = room;
    }

    public void addLesson(String lesson){
        for (int i = 0; i < this.lessons.length; i++) {
            if (this.lessons[i] == null) {
                this.lessons[i] = lesson;
                return;
            }
        }
    }

    public void removeLesson(String lesson){
        for (int i = 0; i < this.lessons.length; i++) {
            if ( this.lessons[i]!=null && this.lessons[i].equals(lesson)){
                this.lessons[i]=null;
                return;
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        Teacher teacher = (Teacher) o;
        return this.name.equals(teacher.name);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, age, room);
        result = 31 * result + Arrays.hashCode(lessons);
        return result;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", room=" + room +
                '}';
    }
}
