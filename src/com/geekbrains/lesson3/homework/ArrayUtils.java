package com.geekbrains.lesson3.homework;

import java.util.Arrays;

public class ArrayUtils {

    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    private static void printArray(int[][] array) {
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }
}
