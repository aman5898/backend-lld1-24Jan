package org.scaler.LambdasAndStreams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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

        Runnable r = ()->{
            System.out.println("Hello World");
        };

        r.run();

        Thread t = new Thread(r);

        Thread t2 = new Thread(()->{
            System.out.println("Hello World");
        });

        ArrayList<Integer> list = new ArrayList<>();
        list.add(500);
        list.add(100);
        list.add(15);

        Comparator<Integer> cmp = (o1,o2)->{
            return o2-o1;
        };

        Collections.sort(list,(o1,o2)->{
            return o2-o1;
        });

        System.out.println(list);
    }
}
