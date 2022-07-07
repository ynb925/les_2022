package com.ynb.zarArrays;
/**
 * Задание 19.40 Напишите метод, который принимает в качестве параметра массив целых чисел и возвращает новый массив,
 * который содержит те же значения, что и массив, полученный в качестве параметра, но в обратном порядке. Например,
 * если в качестве параметра получен массив 1, 3, 6, 2, 7 -метод возвращает массив 7, 2, 6, 3, 1.
 */

import java.util.Arrays;

public class Arr19_40 {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(arrReWrite(arr)));
    }

    public static int[] arrReWrite(int[] array) {
        int[] arraynew = new int[array.length];
        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
            arraynew[i] = array[j];
        }
        return arraynew;
    }
}


