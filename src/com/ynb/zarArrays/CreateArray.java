package com.ynb.zarArrays;

import java.util.Random;
import java.util.Scanner;

public class CreateArray {

    public static int[] createArr(int min, int max) {
        System.out.println(" write size of arr :");
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[scanner.nextInt()];
        Random random = new Random();

        for(int i = 0; i < arr.length; i++)
            arr[i] = random.nextInt(min, max);

        return  arr;
    }

    public static void printArr(int[] arr) {
        for(int i = 0; i < arr.length; i++)
            System.out.println(i + "-" + arr[i]);
    }
}
/**
 *
 *  public static int[] createArray(){
 *         Random ran = new Random();
 *
 *         Scanner scan = new Scanner(System.in);
 *         System.out.println("index amount of array: ");
 *         int[] arr = new int[scan.nextInt()];
 *
 *         System.out.println("rang from: ");
 *         int min = scan.nextInt();
 *
 *         System.out.println("rang to: ");
 *         int max = scan.nextInt();
 *
 *         for (int i = 0; i < arr.length; i++) {
 *             arr[i] = ran.nextInt(min,max);
 *             System.out.println("index is: " + i + " -- value is: " + arr[i] + "  ");
 *         }
 *         return arr;
 *     }
 *
 * }
 */