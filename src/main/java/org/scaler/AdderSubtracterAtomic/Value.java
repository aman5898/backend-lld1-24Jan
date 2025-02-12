package org.scaler.AdderSubtracterAtomic;

import java.util.concurrent.atomic.AtomicInteger;

public class Value {
    public AtomicInteger value = new AtomicInteger(0);
}

// this.v.value += i;

//t <- value
//t = t+i;
//t-> value

// C and S algo

//t <- value -> x
//t = t+i;
//t-> value
//if(value == x){
//     t-> val;
//}else{
//    re-read the initial value;
//        }
