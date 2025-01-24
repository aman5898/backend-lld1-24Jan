package org.scaler.IntroToOops;

public class Student {
    private String name;
    int age;
    protected double psp;
    public String batch;


//   1 Student st = new Student();
//   2  Student st2 = new Student("Aman",26,100,"Best Batch");

    // Constructor is a special function
//    1. Name as Class name
//    2. no return type
//    Initialise data members
//    public Student(){
//        name = "Abhilash";
//        age = 20;
//        psp = 30;
//        batch = "xyz";
//
//    }


//    public Student(String name2, int a, double b, String c){
//        name = name2;
//        age = a;
//        psp = b;
//        batch = c;
//
//    }

    void print(){
        System.out.println("Name"+ name);
    }

    void setName(String name2){
        name = name2;
    }

    String getName(){
        return this.name;
    }
}
