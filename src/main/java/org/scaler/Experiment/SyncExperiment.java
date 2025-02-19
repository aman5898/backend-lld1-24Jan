package org.scaler.Experiment;

public class SyncExperiment {

    // Static synchronized method (locks on SyncExperiment.class)
    public static synchronized void staticSyncMethod(String threadName) {
        System.out.println(threadName + " entered staticSyncMethod at " + System.currentTimeMillis());
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println(threadName + " exiting staticSyncMethod at " + System.currentTimeMillis());
    }

    // Instance synchronized method (locks on the instance)
    public synchronized void instanceSyncMethod(String threadName) {
        System.out.println(threadName + " entered instanceSyncMethod on " + this + " at " + System.currentTimeMillis());
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println(threadName + " exiting instanceSyncMethod on " + this + " at " + System.currentTimeMillis());
    }

    public static void main(String[] args) {
        // Experiment 1: Static synchronized methods (using the class lock)
        Thread t1 = new Thread(() -> staticSyncMethod("Static-Thread-1"));
        Thread t2 = new Thread(() -> staticSyncMethod("Static-Thread-2"));
        t1.start();
        t2.start();

        // Wait for static threads to finish
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // Experiment 2: Instance synchronized methods on different objects
        SyncExperiment obj1 = new SyncExperiment();
        SyncExperiment obj2 = new SyncExperiment();

        Thread t3 = new Thread(() -> obj1.instanceSyncMethod("Instance-Thread-1"));
        Thread t4 = new Thread(() -> obj2.instanceSyncMethod("Instance-Thread-2"));
        t3.start();
        t4.start();

        // Wait for instance threads to finish
        try {
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // The two instance methods can run concurrently since they lock on different instances.

        // Experiment 3: Instance synchronized methods on different objects
        SyncExperiment obj = new SyncExperiment();

        Thread t5 = new Thread(() -> obj.instanceSyncMethod("Instance-Thread"));
        Thread t6 = new Thread(() -> staticSyncMethod("Static-Thread"));
        t5.start();
        t6.start();

        // The instance and Static Threads can run concurrently since they lock on different instances(SyncExperiment.Class and obj).
    }
}
