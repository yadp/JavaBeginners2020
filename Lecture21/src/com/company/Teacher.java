package com.company;

public class Teacher {

    private String name;
    private String secondName;

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setName(String name,String secondName){
        this.name = name;
        this.secondName = secondName;
    }

}
