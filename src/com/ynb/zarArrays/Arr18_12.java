package com.ynb.zarArrays;

import java.util.Random;
import java.util.Scanner;

/**
 * Задание 18.12 Напишите класс, который заполняет случайными трехзначными числами массив,
 * размер которого при инициализации вводится с клавиатуры. После заполнения класс должен
 * вывести на экран значения массива в одной строке, начиная с «начала» массива (с первой ячейки).
 */
public class Arr18_12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println(" write size arr");
        int[] numArr = new int[scanner.nextInt()];

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = random.nextInt(100, 1000);
            System.out.println(i + ": " + numArr[i] + " ");
        }
    }
}

