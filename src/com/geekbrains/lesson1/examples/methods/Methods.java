package com.geekbrains.lesson1.examples.methods;

public class Methods {

    public static void main(String[] args) {
        drawCat();
        drawCat();
    }

    private static void drawCat() {
        System.out.println("           _..---...,\"\"-._     ,/}/)\n" +
                "        .''        ,      ``..'(/-<\n" +
                "       /   _      {      )         \\\n" +
                "      ;   _ `.     `.   <         a(\n" +
                "    ,'   ( \\  )      `.  \\ __.._ .: y\n" +
                "   (  <\\_-) )'-.____...\\  `._   //-'\n" +
                "    `. `-' /-._)))      `-._)))\n" +
                "      `...'         ");

        System.out.println("Привет это был кот");

        char c1 = 'H';
        System.out.println(c1);


        int a = 20;
        String b = "myNumber = ";
        a *= 5; // a = a * 5;
        a += 1; // a = a + 1
        System.out.println(b + a);


    }
}
