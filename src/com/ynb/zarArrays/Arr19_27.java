package com.ynb.zarArrays;

import java.util.Scanner;

/**
 * Задание 19.27 Напишите метод, который принимает в качестве параметра массив целых чисел М и целое число К
 * (номер одной из ячеек массива). Метод возвращает сумму значений, расположенных в ячейках массива
 * от начальной -до ячейки номер К(включительно).
 */

public class Arr19_27 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("--------------------------------");
        System.out.println(sumArray(array));
    }

    public static int sumArray(int[] array) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter index number :");
        int index = scanner.nextInt();
        for (int i = 0; i <= index; i++) {
            sum += array[i];
        }
        return sum;
    }

}
