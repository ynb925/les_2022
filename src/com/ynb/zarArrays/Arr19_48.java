package com.ynb.zarArrays;

/**
 * Задание 19.48 Напишите метод, который принимает в качестве параметров два массива целых чисел и проверяет,
 * содержатся ли все значения первого массива во втором.
 * <p>
 * {1 4 3 2}     {5 8 1 6 4 2 9 3}       -> true
 * <p>
 * {1 2 3}        {5 1 8 3 99}              ->false
 */


public class Arr19_48 {
    public static void main(String[] args) {

        int[] arr1 = new int[]{1, 4, 3, 2};
        int[] arr2 = new int[]{5, 1, 2, 6, 4, 2, 9, 3};

        System.out.println(arrEqualNums(arr1, arr2));
    }

    private static boolean arrEqualNums(int[] array1, int[] array2) {
        first:
        for (int k : array1) {
            for (int i : array2) {
                if (k == i)
                    continue first;
            }
            return false;
        }
        return true;
    }
}