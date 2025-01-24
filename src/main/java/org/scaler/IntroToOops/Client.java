package org.scaler.IntroToOops;

public class Client {
    public static void main(String[] args) {
        Student st = new Student();
        st.age = 35;

//        Student st2 = st;
//        st2.age+=10;
//
//        System.out.println(st.age);
//        System.out.println(st2.age);

//        st.setName("Akshay");
//        System.out.println(st.getName());

        System.out.println(st.batch);
//        System.out.println(st.name);
        System.out.println(st.age);
        System.out.println(st.psp);
    }
}
