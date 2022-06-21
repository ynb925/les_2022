package com.ynb.zarArrays;

import java.util.Random;
import java.util.Scanner;

/**
 * Задание 19.18 Напишите метод, который получает в качестве параметра массив
 * и и проверяет в масиве неубывающую последовательность (каждый элемент не меньше предыдущего).
 * Пример:
 * 1 2 5 9 9 12 99 - метод возвращает TRUE
 * 10 12 22 5 84 - метод возвращает FALSE
 */

public class Arr19_18 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" write size of arr :");
        int[] arrSize = new int[scanner.nextInt()];

        mirrorArray(arrSize);

    }

    public static void mirrorArray(int[] array) {
        Random random = new Random();


        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10, 100);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("--------------------------------");

        for (int j : array) {
            if (array[array.length - 1] > array[j]) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
}