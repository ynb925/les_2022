package com.ynb.zarArrays;

import java.util.Random;
import java.util.Scanner;

/**
 * Задание 19.6
 * Напишите метод, который получает в качестве параметра массив, который выводит на экран
 * содержащиеся в нем значения в одну строку через пробел между значениями.
 */
public class Arr19_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println(" write size of arr :");
        int[] arr = new int[scanner.nextInt()];
//        int[] arr = {1, 2, 3, 4, 5};
//
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10, 100);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("-------------------------------------------");
        arrPrint(arr);

//        arrIncrem(arr);
//        System.out.println("-------------------------------------------");
//        arrPrint(arr);
    }

    public static void arrPrint(int[] arrayInMethod) {
        for (int i = 0; i < arrayInMethod.length; i++) {
            System.out.println(arrayInMethod[i] + " ");
        }
    }
}

//    public static void arrIncrem(int[] arrayInMethod) {
//        for (int i = 0; i < arrayInMethod.length; i++) {
//            arrayInMethod[i]++;
//            System.out.println(arrayInMethod[i]);
//        }
//    }
//
//    public static int test(int value) {
//        value++;
//        System.out.println("test " + value);
//        return value;
//    }
//}