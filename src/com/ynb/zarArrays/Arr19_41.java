package com.ynb.zarArrays;

import java.util.Arrays;

/**
 * Задание 19.41 Напишите метод, который принимает в качестве параметра массив целых чисел и возвращает новый массив
 * с переставленными первой и второй половинами.
 * Например, если в качестве параметра получен массив 1, 3, 6, 8, 2, 7
 * -метод возвращает массив 8, 2, 7, 1, 3, 6.
 */

public class Arr19_41 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 6, 8, 2, 7};
        System.out.println(Arrays.toString(arrReWrite(arr)));
    }

    public static int[] arrReWrite(int[] array) {
        int[] arraynew = new int[array.length];
        for (int i = 0, j = array.length / 2; i < array.length / 2; i++, j++) {
            int temp = array[i];
            arraynew[i] = array[j];
            arraynew[j] = temp;
        }
        return arraynew;
    }
}