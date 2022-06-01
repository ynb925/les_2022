package com.ynb.zarArrays;

/**
 * сравнить сумму чисел внутри массивов и написать в каком массиве больше.
 */
public class rushArrays_3 {
    public static void main(String[] args) {

        int[] arr1 = new int[]{1, 3, 33, 44, 66, 7, 8, 32, 45, 11};
        int[] arr2 = new int[]{36, 3, 24, 11, 66, 7, 34, 32, 17, 2};

        System.out.println(checkLengthArr(arr1, arr2));
    }

    public static boolean checkLengthArr(int[] arr1, int[] arr2) {
        return arr1.length == arr2.length;
    }
}
