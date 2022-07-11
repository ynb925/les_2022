package com.ynb.zarArrays;

/**
 * Задание 19.47 Полезная задача, но наверное подгорит)
 * Напишите метод, который принимает в качестве параметров два массива целых чисел одинаковой длины
 * и проверяет, являются ли массивы идентичными.
 * пример
 * 1 2 3 5 7    и    1 2 3 5 7  -> true
 * 1 2 3 4 7    и    1 2 3 5 7  -> false
 */

public class Arr19_47 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6};
        int[] arr2 = new int[]{1, 2, 3, 4, 5, 6};

        System.out.println(arrEqual(arr1, arr2));
    }

    private static boolean arrEqual(int[] array1, int[] array2) {

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }
}
