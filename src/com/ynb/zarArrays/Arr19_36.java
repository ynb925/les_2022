package com.ynb.zarArrays;

/**
 * Задание 19.36 Напишите метод, который принимает в качестве параметра
 * массив целых чисел и возвращает максимальное значение массива.
 */

public class Arr19_36 {
    public static void main(String[] args) {
         int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
     //   int[] array = new int[]{-5, -10, -22, -8, -7};
        System.out.println(biggestValue(array));
    }

    public static int biggestValue(int[] array) {
        int bigValue = array[0];

        for (int j : array) {
            if (bigValue < j) {
                bigValue = j;
            }
        }
        return bigValue;
    }
}