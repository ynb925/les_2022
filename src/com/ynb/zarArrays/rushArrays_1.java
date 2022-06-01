package com.ynb.zarArrays;

import java.util.Scanner;

/**
 * считать с клав-ры числа и поместить их в массив,после рспечатать.
 */

public class rushArrays_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" wrt length of array ");
        int lengthArr = scanner.nextInt();
        int[] numArr = new int[lengthArr];


        System.out.println(" in nums for array ");
        for (int i = 0; i < lengthArr; i++) {
            numArr[i] = scanner.nextInt();  // вводим данные в массив
        }

        System.out.print("Inserted array elements:");
        for (int i = 0; i < lengthArr; i++) {
            System.out.print(" " + numArr[i]); // Выводим на экран, полученный массив
        }
    }
}
