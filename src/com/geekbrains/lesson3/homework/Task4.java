package com.geekbrains.lesson3.homework;

import java.util.Arrays;

public class Task4 {

    public static void main(String[] args) {
        int[][] array = new int[5][5];
        int lastIndex = array.length - 1;

        example2(array, lastIndex);

        printArray(array);
    }

    private static void example1(int[][] array, int lastIndex) {
        for (int i = 0; i < array.length; i++) {
            int[] row = array[i];
            for (int j = 0; j < row.length; j++) {
                if (i == j) {
                    array[i][j] = 1;
                }
            }
            array[i][lastIndex - i] = 1;
        }
    }

    private static void example2(int[][] array, int lastIndex) {
        for (int i = 0; i < array.length; i++) {
            array[i][i] = array[i][lastIndex - i] = 1;
        }
    }

    private static void printArray(int[][] array) {
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }
}
