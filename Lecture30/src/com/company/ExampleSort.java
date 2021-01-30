package com.company;

import java.util.Collections;
import java.util.List;

public class ExampleSort {

    private List<Integer> integerList;

    public List<Integer> getIntegerList() {
        return integerList;
    }

    public void setIntegerList(List<Integer> integerList) {
        this.integerList = integerList;
    }

    public ExampleSort() {
    }

    public ExampleSort(List<Integer> integerList) {
        this.integerList = integerList;
    }

    public void addInt(int a){
        if (a>=0) {
            integerList.add(a);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void removePosition(int a){
        integerList.remove(a);
    }

    public List<Integer> sortList(){
        Collections.sort(integerList);
        return integerList;
    }

    @Override
    public String toString() {
        return "";
    }

    public boolean booleanMethod() {
        return true;
    }
}
