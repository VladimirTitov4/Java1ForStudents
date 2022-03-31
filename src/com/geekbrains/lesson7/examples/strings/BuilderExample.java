package com.geekbrains.lesson7.examples.strings;

public class BuilderExample {

    public static void main(String[] args) {
//        baseConcatenation();
//        builderConcatenation();

        String s = "Привет";
        char[] chars = s.toCharArray();
        int length = chars.length;

        for (int i = length - 1; i >= 0; i--) {
//            System.out.print(chars[i]);
        }

        StringBuilder builder = new StringBuilder();
        builder.append(s);

        StringBuilder reverse = builder.reverse();

        System.out.println(reverse);
    }

    private static void baseConcatenation() {
        System.out.println("start");
        long startTime = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < 512_000; i++) {
            str += "x";
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
        System.out.println("end");
    }

    private static void builderConcatenation() {
        System.out.println("start");
        long startTime = System.currentTimeMillis();
        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i < 512_000; i++) {
            strBuilder.append("x");
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
        System.out.println("end");
    }

}
