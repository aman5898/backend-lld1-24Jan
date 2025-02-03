package org.scaler.Interfaces;

public class Dog extends Animal implements Runner,RunnerPlus{
    @Override
    public void run() {
        System.out.println("Dog is running");
    }

    @Override
    void xyz() {

    }
}
