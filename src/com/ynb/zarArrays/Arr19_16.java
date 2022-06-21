package com.ynb.zarArrays;

import java.util.Random;
import java.util.Scanner;

/**
 * Задание 19.16 Любопытненько)
 * Напишите метод, который получает в качестве параметра массив и заполняет
 * его положительными случайными двузначными числами так, чтобы значение
 * первого элемента было равно значению последнего, значение второго элемента
 * было равно значению предпоследнего и так далее
 */

public class Arr19_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" write size of arr :");
        int[] arrSize = new int[scanner.nextInt()];

        mirrorArray(arrSize);
    }

    public static void mirrorArray(int[] array) {
        Random random = new Random();
        int midleArr = array.length / 2;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10, 100);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("------- data input -------------");

        for (int i = 0, j = array.length - 1; i < midleArr; i++, j--) {
            System.out.print(array[i] + " " + array[j] + " ");
        }
    }
}
