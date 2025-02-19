package org.scaler.LambdasAndStreams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Client {
    public static void main(String[] args) {

////        Anonymous Class
//
//        SampleInterface si = new SampleInterface(){
//
//            @Override
//            public void fun() {
//                System.out.println("Hello Fun");
//            }
//
//            @Override
//            public void bun() {
//                System.out.println("Hello Bun");
//            }
//        };
//
//        si.bun();
//
//        Student st = new Student(){
//
//            private int test;
//
//            public void bun(){
//                System.out.println("ANonymous's Fun Method");
//            }
//
//            @Override
//            public void fun(){
//                System.out.println("ANonymous's Fun Method");
//            }
//        };
//
////        st.bun();
//
//        Runnable r = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("My Task");
//            }
//        };
//
//        Thread t = new Thread(r);
//        t.start();
//
//        Runnable r2 = new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        };
//
//        Thread t2 = new Thread(r2);
//
//        Thread t3 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        });

        // Lambda's
//        Way 1
//        HelloWorldPrinter
//            Runnable r = new HelloWorldPrinter
//        Way 2:
//        Runnable r = new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        }
//        Thread t = new Thread(()->{
//            System.out.println(Thread.currentThread().getName()+ " Hello World");
//        });
//        t.start();

//        Runnable r = new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        };

//        Runnable r = ()->{
//            System.out.println("Hello World");
//        };
//
//        r.run();
//
//        Thread t = new Thread(r);
//
//        Thread t2 = new Thread(()->{
//            System.out.println("Hello World");
//        });
//
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(500);
//        list.add(100);
//        list.add(15);
//
//        Comparator<Integer> cmp = (o1,o2)->{
//            return o2-o1;
//        };
//
//
//        Collections.sort(list,(o1,o2)->{
//            return o2-o1;
//        });
//
//        System.out.println(list);

//        List<Integer> l2 = List.of(5 , 10 ,2 ,1 ,16 , 3 ,8 , 1 , 2 , 2);

//        Stream<Integer> s1 = l2.stream();

//        s1.forEach((elem)->{
//            System.out.print(elem+" ");
//        });

//        s1 = s1.limit(4);
//
//        s1.forEach((elem)->{
//            System.out.print(elem+" ");
//        });
//
//        System.out.println();
//
//        System.out.println(l2);

//        Streams -> Intermediate and Terminal
//        Intermediate fn -> Return a Stream back
//        Terminal fn -> Terminates a stream

//        List<Integer> l2 = List.of(5 , 10 ,2 ,1 ,16 , 3 ,8 , 1 , 2 , 2);
//
//        l2.stream().limit(4).forEach((e)-> System.out.println(e));

        List<Student> list1 = new ArrayList<>();
//        Student st1 = new Student(25 , 65.0 , "Mohit" , 10.0);
//        Student st2 = new Student(21 , 78.0 , "Nishant" , 100.0);
        list1.add(new Student(25 , 65.0 , "Mohit" , 10.0));
        list1.add(new Student(21 , 78.0 , "Nishant" , 100.0));
        list1.add(new Student(28 , 20.0 , "Rohan" , 90.0));

//        list1.stream().filter((e)->{
//            return e.psp>50;
//        }).limit(3).forEach((e)->{
//            System.out.println(e);
//        });

//        list1.stream().filter((e)-> e.psp>50).limit(1).forEach((e)->{System.out.println(e);});

//        System.out.println(list1);
//        List<Student> l3 = list1.stream().filter(e->e.psp>50).collect(Collectors.toList());
//        System.out.println(l3);

        List<Integer> l2 = List.of(5 , 10 ,2 ,1 ,16 , 3 ,8 , 1 , 2 , 2);

//        Predicate<Integer> predicate = (e)->{
//            return e%2==0;
//        };

        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return false;
            }
        };

        List<Integer> l3 = l2.stream().filter(predicate).map(e->{
            return e*e;
        }).collect(Collectors.toList());

        System.out.println(l3);



    }
}
