package com.geekbrains.lesson3.homework;

public class Task6 {

    public static void main(String[] args) {
        int[] array = {7, 10, 14, 11, 4, 5};

        int min = array[0];
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("Минимальное значение в массиве = " + min);
        System.out.println("Максимальное значение в массиве = " + max);
    }
}
