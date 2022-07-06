package com.ynb.zarArrays;

import java.util.Random;
import java.util.Scanner;

/**
 * Задание 19.24 Напишите метод, который принимает в качестве параметра массив целых чисел и проверяет,
 * являются ли все элементы массива положительными числами.
 */
public class Arr19_24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println(" wrt arr size:");
        int[] arr = new int[scanner.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(-10, 10);
            System.out.println(arr[i] + " ");
        }
        System.out.println("--------------------------------");
        System.out.println(arrСontain(arr));
    }

    public static boolean arrСontain(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                return true;
            }
        }
        return false;
    }
}