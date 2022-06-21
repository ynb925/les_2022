package com.ynb.zarArrays;

import java.util.Scanner;

/**
 * Задание 19.13 Напишите метод, который получает в качестве параметра
 * массив и число которым нужно заполнить этот массив.
 */

public class Arr19_13 {
    public static void main(String[] args) {
        System.out.println(" arr size ");
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[scanner.nextInt()];

        arrPrintNum(arr);
    }

    public static void arrPrintNum(int[] array) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" num for print into arr");
        int printNum = scanner.nextInt();

        for (int i = 0; i < array.length; i++) {
            array[i] = printNum;
            System.out.print(array[i] + " ");
        }
    }
}
