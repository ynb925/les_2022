package com.ynb.zarArrays;

import java.util.Random;
import java.util.Scanner;

/**
 * Задание 19.17 Напишите метод, который получает в качестве параметра массив и заполняет
 * его положительными случайными двузначными числами так,
 * чтобы первая и вторая половины массива были идентичными.
 * In.   {0,0,0,0,0,0,0}
 * Out {15, 22, 88, 12, 15, 22, 88}
 */

public class Arr19_17 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" write size of arr :");
        int[] arrSize = new int[scanner.nextInt()];

        mirrorArray(arrSize);

        for (int j : arrSize) {
            System.out.print(j + " ");
        }
    }

    public static void mirrorArray(int[] array) {
        Random random = new Random();
        int midleArr = array.length / 2;

        for (int i = 0, j = midleArr + 1; i < midleArr; i++, j++) {
            array[i] = random.nextInt(10, 100);
            array[j] = array[i];
            array[i] = array[j];
        }
        if (array.length % 2 != 0) {
            array[midleArr] += random.nextInt(10, 100);
        }
    }
}