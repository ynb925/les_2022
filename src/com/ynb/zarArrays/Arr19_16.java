package com.ynb.zarArrays;

import java.util.Random;
import java.util.Scanner;

/**
 * Задание 19.16 Любопытненько)
 * Напишите метод, который получает в качестве параметра массив и заполняет
 * его положительными случайными двузначными числами так, чтобы значение
 * первого элемента было равно значению последнего,
 * значение второго элемента
 * было равно значению предпоследнего и так далее
 */

public class Arr19_16 {
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

        for (int i = 0, j = array.length - 1; i < midleArr; i++, j--) {
            array[i] = random.nextInt(10, 100);
            array[j] = array[i];
        }
        if (array.length % 2 != 0) {
            array[midleArr] += random.nextInt(10, 100);
        }
    }
}
