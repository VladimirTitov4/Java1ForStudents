package com.geekbrains.lesson3.examples;

public class OverloadExample {

    public static void main(String[] args) {
        int sum = sum("test string", 1, 2);
        System.out.println(sum);
    }

    public static int sum(String str, int... ints) {
        int result = 0;
        for (int i = 0; i < ints.length; i++) {
            System.out.println(str);
            result += ints[i];
        }
        return result;
    }
}
