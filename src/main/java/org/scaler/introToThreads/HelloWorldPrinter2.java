package org.scaler.introToThreads;

public class HelloWorldPrinter2 extends Thread{
    @Override
    public void run(){
        System.out.println("Hello World"+Thread.currentThread().getName());
    }
}
