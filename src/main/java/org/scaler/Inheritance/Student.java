package org.scaler.Inheritance;

public class Student extends User{
    double psp;
    int age;
    private String batch;

    // Constructor Chaining

    Student(){
        this("Free Batch",0.0,0);
    }

//    Student st = new Student("Super Cool Batch");

    Student(String batch){
        this(batch,0.0,0);

        this.batch = batch;


    }

    Student(String batch,double psp){
        this(batch);
//        this() -> first line always
        this.psp = psp;
    }

//    Student st = new Student("Super Cool Batch",2.2);

    Student(String batch,double psp,int age){
        this.batch = batch;
        this.psp = psp;
        this.age = age;

    }

//    Student(){
//        this.batch = "Free Batch";
//        this.psp = 1;
//        this.age = 0;
//    }
//
//    Student(String batch){
//        this.batch = batch;
//        this.psp = 1;
//        this.age = 0;
//    }
//Student st = new Student("Super Cool Batch");
//
//    Student(String batch,double psp){
//        this.batch = batch;
//        this.psp = psp;
//        this.age = 0;
//    }
//
//    Student(String batch,double psp,int age){
//        this.batch = batch;
//        this.psp = psp;
//        this.age = age;
//    }

//    public void TestStudent(){
//        Test();
//    }
}
