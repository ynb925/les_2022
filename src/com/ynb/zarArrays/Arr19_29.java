package com.ynb.zarArrays;
/**
 * Задание 19.29 Напишите метод, который принимает в качестве параметра массив целых чисел М
 * и два целых числа К и Т (номера ячеек массива). Метод возвращает сумму значений,
 * расположенных в ячейках массива от ячейки номер К(включительно) -до ячейки номер Т(включительно).
 */

import java.util.Scanner;

public class Arr19_29 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Scanner scanner = new Scanner(System.in);

        System.out.println(" enter 1st index :");
        int index1 = scanner.nextInt();
        System.out.println(" enter 2nd index :");
        int index2 = scanner.nextInt();

        System.out.println(sumArray(array, index1, index2));
    }

    public static int sumArray(int[] array, int value1, int value2) {
        int sum = 0;

        for (int i = value1; i <= value2; i++) {
            sum += array[i];
        }
        return sum;
    }

}