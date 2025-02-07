package org.scaler.ThreadPool;

public class NumberPrinter implements Runnable{

    int number;
    
    NumberPrinter(int num){
        this.number = num;
    }

    @Override
    public void run() {
        System.out.println(this.number+" "+Thread.currentThread().getName());
    }
}
