package com.ynb.zarArrays;

import java.util.Scanner;

/**
 * считать с клав-ры числа и поместить их в массив,после рспечатать все чётные числа.
 */

public class rushArrays_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" wrt length of array ");
        int lengthArr = scanner.nextInt();
        int[] numArr = new int[lengthArr];


        System.out.println(" in nums for array ");
        for (int i = 0; i < lengthArr; i++) {
            numArr[i] = scanner.nextInt();       // input data to arr
        }

        System.out.println("Inserted array elements:");
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] % 2 == 0) {
                System.out.println(i + ":" + numArr[i] + " ");   // print even nums in arr
            }
            //  System.out.println(i + ":" + numArr[i] + " ");
        }
    }
}
