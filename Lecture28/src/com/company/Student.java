package com.company;

public class Student {

    private String name;
    private String age;

    public String getName() throws NullStudentName{
        if (name == null){
            throw new NullStudentName("This student doesn't have a name");
        }
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
