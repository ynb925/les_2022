package com.ynb.zarArrays;

import java.util.Arrays;

/**
 * сортировка данных в массивах по велечине значения
 */
public class rushArrays_5 {
    public static void main(String[] args) {

        int[] arr1 = new int[]{1, 3, 23, 44, 66, 20, 8, 32, 45, 11};

        printarray(arr1);
        extracted(arr1);
    }

    private static void printarray(int[] arr1) {

        System.out.println(Arrays.stream(arr1).min());
        System.out.println(Arrays.stream(arr1).max());
    }

    private static void extracted(int[] arr1) {
        System.out.println();
        for (int value : arr1) {
            System.out.print(value + "  ");
        }
        System.out.println();
        System.out.println();

        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
    }
}
