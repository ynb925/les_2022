package com.ynb.zarArrays;

import java.util.Random;
import java.util.Scanner;


/**
 * Задание 19.23 Напишите метод, который принимает два параметра:
 * массив целых чисел М и еще одно целое число Х.
 * Метод проверяет, находится ли число Х в массиве.
 */
public class Arr19_23 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println(" wrt arr size:");
        int[] arr = new int[scanner.nextInt()];
        System.out.println(" wrt X num for check in arr: ");
        int Xnum = scanner.nextInt();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10, 20);
            System.out.println(arr[i] + " ");
        }
        System.out.println("--------------------------------");
        System.out.println(arrСontain(arr, Xnum));
    }

    public static boolean arrСontain(int[] array, int value) {

        for (int j : array) {
            if (value == j) {
                return true;
            }
        }
        return false;
    }
}
