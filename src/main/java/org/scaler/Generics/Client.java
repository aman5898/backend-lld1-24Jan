package org.scaler.Generics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Client {
    public static void main(String[] args) {
//        Pair<Integer,String> p1 = new Pair(1,"Shyam");
//        p1.doAgain(2,"SRK",2.5);
////        p1.setFirst("SRK");
//        System.out.println(p1.getSecond());
//
//        Pair<String,Double> p2 = new Pair("Ram",2.2);
//        System.out.println(p2.getFirst());
//
//        OldPair p3 = new OldPair();
//        p3.first = "SRK";
//        p3.first = 5;
//
        // This is allowed because of backward compatibility
//        Pair p5 = new Pair();
//
//        HashMap<String,Integer> hmap = new HashMap<>();
//        HashMap hmap2 = new HashMap();
//
//        ArrayList list = new ArrayList();


//        Pair.doSomething(1,2);
//        System.out.println(Pair.doSomething(5));

        List<Dog> dogs = new ArrayList<>();
//        dogs.add(new Animal(""));
        dogs.add(new Dog("Tobby"));
        dogs.add(new Dog("Tommy"));

        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog("Tom"));
        animals.add(new Dog("Tom1"));
        animals.add(new Animal("Human"));

        AnimalUtility.printAnimalNames(animals);
        AnimalUtility.printAnimalNames(dogs);
    }

}
