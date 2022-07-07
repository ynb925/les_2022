package com.ynb.zarArrays;

import java.util.Arrays;

/**
 * Задание 19.43 Подгорит!
 * Напишите метод, который получает в качестве параметров два упорядоченных по возрастанию массива и возвращает
 * упорядоченный по возрастанию массив, содержащий значения обоих массивов-параметров, но без повторов значений.
 * <p>
 * Например, если массивы-параметры содержат    1, 3, 5, 7     and    2, 5, 7, 9, 11,
 * то выходной массив содержит значения             1, 2, 3, 5, 7, 9, 11.
 */

public class Arr19_43 {
    public static void main(String[] args) {

        int[] arr1 = new int[]{1, 3, 5, 7};
        int[] arr2 = new int[]{2, 5, 7, 9, 11};

        aarsSorting(arr1, arr2);
    }

    public static void aarsSorting(int[] array1, int[] array2) {
        int[] arraynew = new int[array1.length + array2.length];

        for (int i = 0, j = 0; i < array1.length; i++, j++) {
            arraynew[i] = array1[j];
            for (int c = arraynew.length / 2, m = 0; m < array2.length; c++, m++) {
                arraynew[c] = array2[m];
            }
        }
        Arrays.sort(arraynew);
        System.out.print(arraynew[0] + " ");
        for (int i = 1; i < arraynew.length; i++) {
            if (arraynew[i] != arraynew[i - 1]) {
                System.out.print(arraynew[i] + " ");
            }
        }
    }
}
