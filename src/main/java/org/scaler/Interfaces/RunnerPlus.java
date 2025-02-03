package org.scaler.Interfaces;

public interface RunnerPlus {
    void run();

    default void walk(){
        System.out.println("RunnerPlus walk");
    }

    static void doSomething(){
        System.out.println("RunnerPlus Do Something");
    }
}
