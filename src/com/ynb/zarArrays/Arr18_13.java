package com.ynb.zarArrays;

import java.util.Scanner;

/**
 * Задание 18.13 Напишите класс, который заполняет массив рядом чисел
 * - 5, 10, 99, -125, 898, 124, 999, 0, 1, 125, 983, 123, -1000, 89, 69, 996, 44, -1, 102, -87.
 * Размер массива при инициализации вводится с клавиатуры. После заполнения класс должен вывести
 * на экран значения массива в одной строке, начиная с «начала» массива (с первой ячейки).
 */

public class Arr18_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" write size arr");
        int[] arrNum = new int[scanner.nextInt()];

        for (int i : arrNum) {
            i = scanner.nextInt();
            System.out.print(" |" + i + " ");
        }
    }
}

/*        int[] arr = new int[]{
                -5, 10, 99, -125, 898, 124, 999, 0, 1, 125, 983
        };

        for (int i : arr) {
            System.out.print(" |" + i + " ");
        }
    }
}*/
