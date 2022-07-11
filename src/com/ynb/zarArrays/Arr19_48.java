package com.ynb.zarArrays;

/**
 * Задание 19.48 Напишите метод, который принимает в качестве параметров два массива целых чисел и проверяет,
 * содержатся ли все значения первого массива во втором.
 */


public class Arr19_48 {
    public static void main(String[] args) {

        int[] arr1 = new int[]{1, 2, 3, 4, 5, 5};
        int[] arr2 = new int[]{1, 2, 3, 4, 5, 5};

        System.out.println(arrEqual(arr1, arr2));
    }

    private static boolean arrEqual(int[] array1, int[] array2) {

        for (int i = 0; i < array1.length; i++) {
            for (int m = i + 1, j = 0; m < array2.length; m++, j++) {

                if (array1[j] == array2[m]) {
                    return true;
                }
            }
        }
        return false;
    }
}