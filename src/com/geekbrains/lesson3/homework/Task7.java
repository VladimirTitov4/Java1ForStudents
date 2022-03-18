package com.geekbrains.lesson3.homework;

public class Task7 {

    public static void main(String[] args) {
        int[] array = {1, 1, 1, 1, 1, 1};

        System.out.println(checkBalance(array));
    }

    private static boolean checkBalance(int[] array) {
        int leftSum = 0;
        int rightSum = sum(array, 0, array.length);

        for (int j : array) {
            leftSum += j;
            rightSum -= j;
            if (leftSum == rightSum) {
                return true;
            }
        }
        return false;
    }

    private static int sum(int[] array, int from, int to) {
        int sum = 0;
        for (int i = from; i < to; i++) {
            sum += array[i];
        }
        return sum;
    }
}
