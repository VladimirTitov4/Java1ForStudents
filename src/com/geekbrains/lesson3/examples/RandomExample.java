package com.geekbrains.lesson3.examples;

import java.util.Random;

public class RandomExample {

    public static void main(String[] args) {
        Random random = new Random();

        int a = random.nextInt(20 - 10) + 10;

        System.out.println(a);
    }


}
