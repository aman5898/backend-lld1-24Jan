package org.scaler.ExceptionHandling;

import java.sql.SQLException;

public class Client {
    public static void main(String[] args)  {
//        try{
////            System.out.println("Test");
//            Student.doSomething(2);
//
//        }catch(ClassNotFoundException e1){
//            System.out.println(e1);
//        }catch(ArithmeticException e2){
//            System.out.println(e2);
//        }catch (IllegalAccessException e4){
//            System.out.println(e4);
//        }catch (Exception e){
//            System.out.println("Hello World");
//        }


//        try{
////            System.out.println("Test");
//            Student.doSomething(2);
//
//        }catch(Exception e1) {
//            System.out.println(e1);
//        }
//        }catch (Error e){
//            System.out.println(e.getMessage());
//        }


        int x = Student.doSomething(6);
        System.out.println(x);

    }
}
