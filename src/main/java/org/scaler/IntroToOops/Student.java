package org.scaler.IntroToOops;

public class Student {
    private String name;
    int age;
    protected double psp;
    public String batch;
    Exam exam;

    public static int noOfStudents = 0;

    static {
//        Api call
//        dbconnection =
        System.out.println("Testing Static Block");
//        Student st = new Student();
    }

    {
        System.out.println("non Static Block");
    }


//   1 Student st = new Student();
//   2  Student st2 = new Student("Aman",26,100,"Best Batch");

    // Constructor is a special function
//    1. Name as Class name
//    2. no return type
//    Initialise data members
    public Student(){
        noOfStudents++;
    }

    public static void swap(Student s1, Student s2){
        Student temp = s1;
        s1 = s2;
        s2 = temp;
    }

    public static void swapPSP(Student s1, Student s2){
        double temp = s1.psp;
        s1.psp = s2.psp;
        s2.psp = temp;
    }


//    public Student(String name2, int a, double b, String c){
//        name = name2;
//        age = a;
//        psp = b;
//        batch = c;
//
//    }

    public Student(String name, int age){
        this.name = name;
        this.age = age;
        this.exam = new Exam(1, 90);

    }

    public Student(Student other){
        this.name = other.name;
        this.age = other.age;
        this.psp = other.psp;
        this.exam = new Exam(other.exam);
    }



    void print(){
        System.out.println("Name"+ name);
    }

    void setName(String name2){
        name = name2;
    }

    String getName(){
        return this.name;
    }

    static void PrintStatic(){
        System.out.println("Print Static Function");
    }

    static void printNoOfStudents(){
//        System.out.println(noOfStudents);
//        System.out.println(this.batch);
    }

}
