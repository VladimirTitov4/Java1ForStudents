package com.geekbrains.lesson3.homework;

public class Task8 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        shiftArray(array, -22);
        ArrayUtils.printArray(array);
    }

    private static void shiftArray(int[] array, int n) {
        int shiftNumber = n % array.length;
        System.out.println("shiftNumber = " + shiftNumber);

        if (shiftNumber < 0) {
            shiftLeft(array, Math.abs(shiftNumber));
        } else {
            shiftRight(array, shiftNumber);
        }
    }
    // 1 2 3 4 5  (initial)
    // 1 2 3 4 4  (j = 0)
    // 1 2 3 3 4  (j = 1)
    // 1 2 2 3 4  (j = 2)
    // 1 1 2 3 4  (j = 3)
    // 5 1 2 3 4  (j = 4)
    private static void shiftRight(int[] array, int n) {
        for (int i = 0; i < n; i++) {
            int lastValue = array[array.length - 1];
            for (int j = array.length - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }
            array[0] = lastValue;
        }
    }

    private static void shiftLeft(int[] array, int n) {
        for (int i = 0; i < n; i++) {
            int firstValue = array[0];
            for (int j = 0; j < array.length - 1; j++) {
                array[j] = array[j + 1];
            }
            array[array.length - 1] = firstValue;
        }
    }
}
