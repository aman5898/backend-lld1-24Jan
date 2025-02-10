package org.scaler.adderSubtracterSynchronizedMethod;


import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {
    private Value v;

    Adder(Value x){
        v = x;
    }
    public Void call (){
        for(int i = 1;i <=5000; i++){
            this.v.incrementBy(i);
        }
        return null;
    }
}