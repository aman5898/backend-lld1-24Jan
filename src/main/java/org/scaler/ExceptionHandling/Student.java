package org.scaler.ExceptionHandling;

import java.sql.SQLException;

public class Student {

    static void test(int a){
        test(a);
    }

    static int doSomething(int x) {
//        return 1/x;
//        if(x==0){
//            throw new ArithmeticException();
//        }else if(x==1){
//            throw new ClassCastException();
//        }else if(x==2){
//            // checked Exception
//            throw new SQLException();
//        }else if(x==3){
//            throw new NullPointerException();
//        }else if(x==4){
//            throw new IllegalAccessException();
//        }

//        try{
//            throw new IllegalAccessException("Testing Exceptions");
//        }catch (IllegalAccessException e){
//            System.out.println(e.getMessage());
////            return -1;
//        }

//        throw new IllegalAccessException("Testing Exceptions");

//        System.out.println("Hello World");


//        return 0;

//        System.out.println("Test");
//        throw new IllegalAccessException("Test");

//        throw new RandomException();
//        return 0;

//        throw new StackOverflowError("Random Stack OverFlow Error");

//        try{
////            System.out.println("Test");
//            Student.doSomething(2);
//
//        }catch(Exception e1){
//            System.out.println(e1);
//        }catch (Error e){
//            System.out.println(e.getMessage());
//        }

//        test(0);

        try{
            if(x==5){
                throw new Exception();
            }

            if(x==6){
                System.out.println("X==6 in try");
                return 1;
            }

            System.out.println("Clearning Reousces");
            return 2;

        }catch(Exception e1){
            System.out.println(e1);
            return 3;
        }finally {
            System.out.println("Finally Block");
            return 4;
        }




//        return 4;

    }
}
