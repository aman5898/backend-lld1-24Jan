package org.scaler.LambdasAndStreams;

public class Client {
    public static void main(String[] args) {

//        Anonymous Class

        SampleInterface si = new SampleInterface(){

            @Override
            public void fun() {
                System.out.println("Hello Fun");
            }

            @Override
            public void bun() {
                System.out.println("Hello Bun");
            }
        };

        si.bun();

        Student st = new Student(){

            private int test;

            public void bun(){
                System.out.println("ANonymous's Fun Method");
            }

            @Override
            public void fun(){
                System.out.println("ANonymous's Fun Method");
            }
        };

//        st.bun();

        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("My Task");
            }
        };

        Thread t = new Thread(r);
        t.start();

        Runnable r2 = new Runnable() {
            @Override
            public void run() {

            }
        };

        Thread t2 = new Thread(r2);

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
    }
}
