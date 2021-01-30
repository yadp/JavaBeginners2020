package com.company;

public class Teacher {
    private String name;
    private int age;
    private String[] lesson;
    private  double PI;

    public Teacher() {

        this.lesson= new String[5];
    }

    public Teacher(String name, int age, String[] lesson) {
        this.name = name;
        this.age = age;
        this.lesson = lesson;
        PI = 5;
    }

    public String[] getLesson() {
        return lesson;
    }

    /**
     * Adds lesson to the group of lessons for our teacher
     * @param lesson to add
     * @return true if we added the lesson successfully
     */
    public boolean addLesson(String lesson) {
        for (int i = 0; i < this.lesson.length; i++) {
            if (this.lesson[i]==null){
                this.lesson[i]= lesson;
                return true;
            }

        }

        return false;
    }

    /**
     * Adds multiple lessons
     * @param lessons
     */
    public void addLesson(String[] lessons){

        for (int k = 0; k < lessons.length; k++) {
            addLesson(lessons[k]);
        }

    }
    public void addMoney(int money){

    }

    public void addMoney(float gold){

    }





    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
