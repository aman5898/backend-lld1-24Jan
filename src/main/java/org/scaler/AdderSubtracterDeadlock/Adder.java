package org.scaler.AdderSubtracterDeadlock;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {
    private Value v;
    private Lock lock1;
    private Lock lock2;
    
    Adder(Value v, Lock lock1, Lock lock2){
        this.v = v;
        this.lock1 = lock1;
        this.lock2 = lock2;
    }
    
    @Override
    public Void call() throws Exception {

        for(int i=1;i<=1000;i++){
            lock2.lock();
            lock1.lock();
            System.out.println("Adder "+i);
            this.v.value += i;
            lock2.unlock();
            lock1.unlock();
        }

        
        return null;
    }
}
