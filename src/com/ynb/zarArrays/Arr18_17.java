package com.ynb.zarArrays;

import java.util.Random;
import java.util.Scanner;

/**
 * Задание 18.17 Напишите класс, который заполняет случайными трехзначными числами массив,
 * размер которого при инициализации вводится с клавиатуры. После заполнения класс должен
 * вывести на экран значения массива следующим образом: в каждой строке выводится значения
 * из двух ячеек, симметрично расположенных по отношению к середине массива.
 * В случае если массив имеет нечетный размер, центральную ячейку следует выводить в отдельной строке.
 * Например, массив 345, 455, 677, 175, 985 выводится на экран следующим образом: 345 и 985 455и175 677
 * {15, 8, 19, 35, 90} -> 15 и 90, 8 и 35, 19
 */
public class Arr18_17 {
    public static void main(String[] args) {

        Scanner arrSizeNum = new Scanner(System.in);
        Random random = new Random();

        System.out.println(" wrt size of arr ");
        int[] arr = new int[arrSizeNum.nextInt()];
        int midleArr = arr.length / 2;

        System.out.println("------- data input -------------");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100, 1000);
            System.out.println("index: " + i + "| " + arr[i]);
        }
        System.out.println("------- data input -------------");

        System.out.println(" "); //{0 1 2 3 4 5}
        for (int i = 0, j = arr.length - 1; i < midleArr; i++, j--) {
            System.out.print(arr[i] + " " + arr[j]);
            System.out.println();
        }

        if (arr.length % 2 != 0)
            System.out.print("centr index |" + midleArr + ":  " + arr[midleArr]);

    }
}