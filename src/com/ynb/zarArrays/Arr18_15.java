package com.ynb.zarArrays;

import java.util.Random;
import java.util.Scanner;

/**
 * Задание 18.15 Напишите класс, который заполняет случайными двузначными числами массив,
 * размер которого при инициализации вводится с клавиатуры. После заполнения класс должен
 * вывести на экран значения массива следующим образом:
 * • в первой строке -значения из четных ячеек массива;
 * • во второй строке -значения из нечетных ячеек массива.
 */

public class Arr18_15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println(" write size of array:");
        int[] arrSize = new int[scanner.nextInt()];

        for (int i = 0; i < arrSize.length; i++) {
            arrSize[i] = random.nextInt(10, 100);
            System.out.println("test" + i + "| " + arrSize[i]);
        }
        System.out.println();
        for (int j = 0; j < arrSize.length; j += 2) {
            System.out.println(j + "| " + arrSize[j]);
        }
        System.out.println();
        for (int v = 1; v < arrSize.length; v += 2) {
            System.out.println(v + "| " + arrSize[v]);
        }
    }
}
