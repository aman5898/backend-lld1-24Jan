package org.scaler.Interfaces;

public class RoboticDog implements Runner,RunnerPlus{

    @Override
    public void run() {
        System.out.println("Robotic Dog is running");
//        return 0;
    }

    @Override
    public void walk(){
        System.out.println("Robotic Dog walk walking");
    }

    static void doSomething(){
        System.out.println("RoboticDog Do Something");
    }

//    @Override
//    public void run(int x) {
//        System.out.println("Robotic Dog is running");
//    }
}
