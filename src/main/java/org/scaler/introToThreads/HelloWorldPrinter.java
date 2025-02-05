package org.scaler.introToThreads;

public class HelloWorldPrinter implements Runnable{

    @Override
    public void run() {
        try {
            Thread.sleep(10000);
            System.out.println(Thread.currentThread().getName()+" Hello World");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

//        System.out.println(Thread.currentThread().getName()+" Hello World");

    }
}

//a a a a
//a b c d e f
        