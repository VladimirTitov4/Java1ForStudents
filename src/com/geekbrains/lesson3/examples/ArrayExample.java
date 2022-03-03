package com.geekbrains.lesson3.examples;

import java.util.Arrays;

public class ArrayExample {

    public static void main(String[] args) {
        /*int[] array = new int[5];
        array[4] = 777;

        System.out.println(Arrays.toString(array));

        int arrayLength = array.length;
        System.out.println("arrayLength = " + arrayLength);
        System.out.println(array[arrayLength - 1]);*/

//        arrayExample();
        multiArray();
    }

    public static void arrayExample() {
        int[] data = {1, 2, 3, 4, 5, 7, 10, 13, 20};

        for (int i = 0; i < data.length; i += 2) {
            int value = data[i];
            if (value % 2 == 0) {
                System.out.println(value);
            }
        }
    }

    public static void multiArray() {
        int[][] data = new int[3][];
        data[0] = new int[]{1, 2, 3, 0};
        data[1] = new int[]{4, 5};
        data[2] = new int[]{7, 8, 9, 10};

        int c = data[2][3];
        System.out.println("c = " + c);

        for (int i = 0; i < data.length; i++) {
            int[] innerData = data[i];
            for (int j = 0; j < innerData.length; j++) {
                System.out.print(innerData[j] + " ");
            }
            System.out.println();
        }
    }
}
















