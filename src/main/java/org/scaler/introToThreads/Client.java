package org.scaler.introToThreads;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        for(int i=1;i<=100000;i++){
            NumberPrinter numberPrinter = new NumberPrinter(i);
            Thread thread = new Thread(numberPrinter);
//            thread.run();
            thread.start();
        }


////        HelloWorldPrinter h = new HelloWorldPrinter();
//        Runnable h = new HelloWorldPrinter();
//        Thread t = new Thread(h);
//
//        t.start();
//        System.out.println(Thread.currentThread().getName()+" SRK");
//
//        Runnable h2 = new HelloWorldPrinter();
//        Thread t2 = new Thread(h2);
//        t2.start();

        HelloWorldPrinter hp = new HelloWorldPrinter();

//        for(int i=1;i<=1000;i++){
////            Thread.sleep(1000);
//            Thread t = new Thread(hp);
//            t.start();
//        }
//
//        System.out.println("Main Exiting");

//        for(int i=1;i<=100;i++){
//            NumberPrinter numberPrinter = new NumberPrinter(i);
//            Thread thread = new Thread(numberPrinter);
////            thread.run();
//            thread.start();
//        }

//        Thread t = new HelloWorldPrinter2();
//        t.start();


    }
}
