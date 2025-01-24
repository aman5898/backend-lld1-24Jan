package org.scaler.IntroToOops;

public class Student {
    private String name;
    int age;
    protected double psp;
    public String batch;

    void print(){
        System.out.println("Name"+ name);
    }

    void setName(String name2){
        name = name2;
    }

    String getName(){
        return name;
    }
}
