package org.scaler.MultiThreadedMergeSort;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> list = List.of(8,4,0,2,7,4,9,11);

//        ExecutorService es = Executors.newFixedThreadPool(1);
        ExecutorService es = Executors.newCachedThreadPool();

        Sorter sorter = new Sorter(list,es);
        Future<List<Integer>> listFuture = es.submit(sorter);
        List<Integer> ans = listFuture.get();

        System.out.println(ans);

        es.shutdown();

    }
}
