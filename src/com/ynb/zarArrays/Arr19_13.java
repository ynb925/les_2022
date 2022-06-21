package com.ynb.zarArrays;

import java.util.Scanner;

/**
 * Задание 19.13 Напишите метод, который получает в качестве параметра
 * массив и число которым нужно заполнить этот массив.
 */

public class Arr19_13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" arr size ");
        int[] arr = new int[scanner.nextInt()];
        System.out.println(" num for print into arr");
        int printNum = scanner.nextInt();

        arrPrintNum(arr, printNum);
    }

    public static void arrPrintNum(int[] array, int value) {

        for (int i = 0; i < array.length; i++) {
            array[i] = value;
            System.out.print(array[i] + " ");
        }
    }
}

