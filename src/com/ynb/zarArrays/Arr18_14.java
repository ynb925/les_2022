package com.ynb.zarArrays;

import java.util.Random;
import java.util.Scanner;

/**
 * Задание 18.14 Напишите класс, который заполняет случайными трехзначными числами массив,
 * размер которого при инициализации вводится с клавиатуры. После заполнения класс должен
 * вывести на экран значения массива следующим образом:
 * • в первой строке -первую половину массива;
 * • во второй строке -вторую половину массива.
 * В случае если массив имеет нечетный размер, центральную ячейку следует выводить в первой строке.
 */

public class Arr18_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println(" write size of arr :");
        int[] arrSize = new int[scanner.nextInt()];
        int[] arrFirstHalf = new int[]{};
        int[] arrSecondHalf = new int[]{};

        for (int i = 0; i < arrSize.length; i++) {
            arrSize[i] = random.nextInt(100, 999);
            System.out.println(arrSize[i]);

        }

    }
}
