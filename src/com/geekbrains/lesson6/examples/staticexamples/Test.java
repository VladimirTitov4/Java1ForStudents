package com.geekbrains.lesson6.examples.staticexamples;

public class Test {

    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        A a3 = new A();
        A a4 = new A();
        A a5 = new A();

        a3.b = 13;
        a3.a = 15;

        System.out.println("A.a1 = " + a1.a + " and var b = " + a1.b);
        System.out.println("A.a1 = " + a2.a + " and var b = " + a2.b);
        System.out.println("A.a1 = " + a3.a + " and var b = " + a3.b);
        System.out.println("A.a1 = " + a4.a + " and var b = " + a4.b);
        System.out.println("A.a1 = " + a5.a + " and var b = " + a5.b);


    }
}
