package org.scaler.Generics;

public class Pair <V,S>{
    private V first;
    private S second;

    Pair(){

    }

    Pair(V first, S second){
        this.first = first;
        this.second = second;
    }

    public void setFirst(V data){
        this.first = data;
    }

    public V getFirst(){
        return this.first;
    }

    public S getSecond(){
        return this.second;
    }

    public void print(){
        System.out.println("Printing in Pair");
    }

    public <Z,Y> Y doAgain(V data,Y val, Z val2){
        return val;
    }

    // Generic Method
    public <V,S> V doSomething(V val){
//        System.out.println(val);
        return val;
    }

    public static int doSomethingAgain(int val){
//        System.out.println(val);
        return val;
    }

    // V and S willl not be available here
//    public static V doSomething(V val1, S val2){
//        System.out.println(val1);
//        return val1;
//    }
}
