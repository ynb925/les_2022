package com.ynb.zarArrays;

import java.util.Random;
import java.util.Scanner;

/**
 * Задание 18.18 Напишите класс, который заполняет случайными двузначными числами массив,
 * размер которого при инициализации вводится с клавиатуры. После заполнения класс должен
 * вывести на экран значения массива следующим образом:
 * в первой строке -значения из первой половины массива, начиная с «начала));
 * во второй строке -значения из второй половины массива, начиная с «КОНЦЮ).
 */
public class Arr18_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println(" write size of arr :");
        int[] arrSize = new int[scanner.nextInt()];

        int midleArr = arrSize.length / 2;

        System.out.println("------- data input -------------");
        for (int i = 0; i < arrSize.length; i++) {
            arrSize[i] = random.nextInt(10, 100);
            System.out.println(arrSize[i] + " ");
        }
        System.out.println("------- data input -------------");

        for (int f = 0; f <  midleArr; f++) {
            System.out.print("   " + arrSize[f]);
        }
        System.out.println();

        for (int s = arrSize.length - 1; s > midleArr - 1; s--) {
            System.out.print("   " + arrSize[s]);
        }
        System.out.println();
    }
}