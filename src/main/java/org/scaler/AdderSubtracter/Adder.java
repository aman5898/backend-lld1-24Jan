package org.scaler.AdderSubtracter;

import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {
    private Value v;
    
    Adder(Value v){
        this.v = v;
    }
    
    @Override
    public Void call() throws Exception {
        for(int i=1;i<=100000;i++){
            this.v.value += i;
        }
        
        return null;
    }
}
