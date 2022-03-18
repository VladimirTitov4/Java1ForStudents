package com.geekbrains.lesson3.homework;

public class Task5 {

    public static void main(String[] args) {
        ArrayUtils.printArray(initArray(10, 12));
    }

    private static int[] initArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        return array;
    }
}
