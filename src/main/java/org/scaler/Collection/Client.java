package org.scaler.Collection;

import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Client {
    public static void main(String[] args) {
//        Collection : Container
//        List , Set and Queue
//        Collection

//        List : Ordered collection : insertion order
//        index : insert, search, randomAccess
//        duplicate elements are allowed

//         ArrayList
//        array : dynamic, grow
//        Random O(1) index
//        contagious memory required.
        // Not thread safe
//        List<Integer> list = new ArrayList<>();

//        LinkedList
//        dynamic, grow
//        non-contagious memory can be used.
//        LinkedList<>

//        List<Integer> list = new Vector<>();

//        ### Effective Java by Joshua Bloch:
//
//        In "Effective Java," Joshua Bloch, one of the designers of the Java
//        Collections Framework, advises against using legacy collection classes like
//        `Vector` and `Hashtable`. He recommends using the classes from the Collections
//        Framework for new development due to their improved design, performance, and
//        flexibility.

//        ### Conclusion:
//
//        The `Vector` class is considered a legacy class in Java, and while it is
//        still supported, it is generally not recommended for new code.
//                For most applications, using `ArrayList` or other modern
//        collection classes from the Java Collections Framework is preferred
//        due to better performance, more flexible design, and the availability of
//        advanced concurrency utilities.

//        Stack and Vector these two classess are considered legacy class.
//        Stack


        // Set Interface : no duplicate elements are allowed
//        generally not ordered
//        Set -> Fast Lookups

//      no order
//        T.c. on avg O(1)
//        Set<Integer> set = new HashSet<>();
//        set.add(null);

//        Maintain Order + Fast Lookup
//        DLL and HashMap
//        LinkedHashSet -> LinkedHashMap => DLL + HashMap
//        Set<Integer> set = new LinkedHashSet<>();
//        set.add(null);
//        set.add(null);
//        System.out.println(set);

//        Natural Sorting Order
//        Balanced Binary Search Tree -> AVL and Red black tree -> Here Red black Tree is used
//        T.c. -> O(log2n)
//        Set<Integer> tset = new TreeSet<>();
//        tset.add(15);
//        tset.add(5);
//        tset.add(100);
//
//        System.out.println(tset);

//        Queue : A collection designed for holding elements prior to processing.
//        Typically order of Processing is FIFO

//        Directly implemented by pq.
//        Implemented by Another interface dequeue.

        Queue<Integer> pq = new PriorityQueue<>();
//        PQ is ued to store items in the order or Priority.

   /*
        Deque
           Pronounced as 'Deck'
        A linear collection that supports element insertion and removal at both ends. The name deque is short
        for "double ended queue" and is usually pronounced "deck".
*/
//
//        Deque<Integer> dq = new ArrayDeque<>();
////        dq.addLast();
////        dq.removeLast();
//        Deque<Integer> dq2 = new LinkedList<>();

//        Collection
//        Map
//        Map : Key, Value -> O(1)
        Map<Integer,String> map = new HashMap<>();


//        DLL + HashMap
//        Insertion Order
//        T.c. -> O(1)
        Map<Integer,String> map2 = new LinkedHashMap<>();


//      Natural Sorting Order//        Balanced Binary Search Tree -> AVL and Red black tree -> Here Red black Tree is used
//        T.c. -> O(log2n)
//        Map<Integer,String> map3 = new TreeMap<>();
//
//        Map<Integer,String> map4 = new Hashtable<>();

//        Student st = new Student(10,20.1,"Akshay",99);
//        Student st2 = new Student(26,100,"Aman",100);
//        System.out.println(st+" "+st2);

        List<Student> ll = new ArrayList<>();

        ll.add(new Student(25 , 65.0 , "Mohit" , 10.0));
        ll.add(new Student(21 , 78.0 , "Nishant" , 100.0));
        ll.add(new Student(28 , 20.0 , "Rohan" , 90.0));


        System.out.println(ll);



//        Comparator<Student> comp = new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return 0;
//            }
//        }

//        Collections.sort(ll,new StudentPSPComparator());
        Collections.sort(ll,(o1,o2)->{
            return (int)(o1.psp-o2.psp);
        });

        ArrayList<Integer> al = new ArrayList();


        System.out.println(ll);



    }
}
