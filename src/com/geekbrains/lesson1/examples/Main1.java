package com.geekbrains.lesson1.examples;

public class Main1 {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        // && - используется в качестве оператора И (true) && (true)
        // & - правый оператор не используется если слева false

        // || используется в качестве оператора ИЛИ (true) && (false)
        // | правый оператор не используется если слева true

        conditions2();
    }

    private static void conditions2() {
        int a = 0;
        int b = 1;

        boolean aEqualsZero = a != 0;

        System.out.println("aEqualsZero = " + aEqualsZero);

        if (aEqualsZero && b / a == 0) {
            System.out.println("done!");
        } else {
            System.out.println("nope");
        }

    }


}
