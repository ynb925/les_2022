package com.ynb.zarArrays;

import java.util.Arrays;

/**
 * сравнить сумму двух массивов
 */

public class rushArrays_4 {

    public static void main(String[] args) {


        int[] arr1 = new int[]{1, 3, 23, 44, 66, 20, 8, 32, 45, 11};
        int[] arr2 = new int[]{36, 3, 55, 11, 66, 7, 34, 32, 17,17, 2};

        System.out.println(checkSum1(arr1));
        System.out.println(checkSum2(arr2));
        System.out.println(checkLengthArr(arr1, arr2));
    }

    public static int checkSum1(int[] arr1) {
        int sum = 0;

        for (int num : arr1) {
            sum += num;
        }
        return sum;
    }

    public static int checkSum2(int[] arr2) {
        int sum = 0;

        for (int num : arr2) {
            sum += num;
        }
        return sum;
    }

    public static boolean checkLengthArr(int[] arr1, int[] arr2) {

        return arr1.length == arr2.length;
    }
}


