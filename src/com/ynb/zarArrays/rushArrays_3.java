package com.ynb.zarArrays;

import org.jetbrains.annotations.Contract;

/**
 * сравнить длину двух массивов
 */
public class rushArrays_3 {
    public static void main(String[] args) {
        int[] arr1;
        int[] arr2;

        arr1 = new int[]{1, 3, 33, 44, 66, 7, 8, 32, 45, 11};
        arr2 = new int[]{36, 3, 24, 11, 66, 7, 34, 32, 17, 2};


        System.out.println(checkLengthArr(arr1, arr2));
    }

    @Contract(pure = true)  // if  res is true -- arrs is equal
    public static boolean checkLengthArr(int[] arr1, int[] arr2) {
        return arr1.length == arr2.length;
    }
}
