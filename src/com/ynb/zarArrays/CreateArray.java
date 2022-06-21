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
