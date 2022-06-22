package com.ynb.zarArrays;

import java.util.Random;
import java.util.Scanner;

public class arrYura {

    public static int[] createArray() {
        Random ran = new Random();

        Scanner scan = new Scanner(System.in);
        System.out.println("index amount of array: ");
        int[] arr = new int[scan.nextInt()];

        System.out.println("rang from: ");
        int min = scan.nextInt();

        System.out.println("rang to: ");
        int max = scan.nextInt();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = ran.nextInt(min, max);
            System.out.println("index is: " + i + " -- value is: " + arr[i] + "  ");
        }
        return arr;
    }
}


