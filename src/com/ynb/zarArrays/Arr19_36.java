package com.ynb.zarArrays;

/**
 * Задание 19.36 Напишите метод, который принимает в качестве параметра
 * массив целых чисел и возвращает максимальное значение массива.
 */

public class Arr19_36 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(arrayBigindexValue(array));
    }

    public static int arrayBigindexValue(int[] array) {
        int bigValue = 0;

        for (int j : array) {
            if (bigValue <= j) {
                bigValue = j;
            }
        }
        return bigValue;
    }
}