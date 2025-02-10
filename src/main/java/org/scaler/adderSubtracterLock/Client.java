package org.scaler.adderSubtracterLock;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Lock lock = new ReentrantLock();

        Value v = new Value();
        Adder a = new Adder(v,lock);
        Subtracter s = new Subtracter(v,lock);

        ExecutorService es = Executors.newFixedThreadPool(2);

        Future<Void> futureAdder = es.submit(a);
        Future<Void> futureSubtracter = es.submit(s);

        futureAdder.get();
        futureSubtracter.get();

        System.out.println(v.value);
        es.shutdown();
    }
}
