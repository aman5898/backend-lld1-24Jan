package org.scaler.Collection;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    int age;
    double psp;
    String name;
    double attendance;

    Student(int age, double psp, String name , double attendance) {
        this.age = age;
        this.psp = psp;
        this.name = name;
        this.attendance = attendance;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + this.age +
                ", psp=" + this.psp +
                ", name='" + this.name + '\'' +
                ", attendance=" + this.attendance +
                '}';
    }

//    Whenever this object should come first will return -1, other will return 1
//    @Override
//    public int compareTo(Student o) {
//        if(this.age>o.age){
//            return -1;
//        }else if(o.age>this.age){
//            return 1;
//        }else{
//            return 0;
//        }
//    }

    @Override
    public int compareTo(Student o) {
        return o.age-this.age;
    }
}
