package com.ynb.zarTaskWhile;

import java.util.Scanner;

/**
 * Задание 15.31 Напишите класс, который принимает с клавиатуры
 * серию целых чисел до тех пор, пока количество четных чисел в серии остается меньше 5.
 */


public class Zar_task_15_31_w {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" count of enter nums: ");
        int scan;
        int countIter = 0;

        while (countIter < 5) {
            scan = scanner.nextInt();
            if (scan % 2 == 0) {
                countIter++;
            }
        }
        System.out.println("even nums is < 5 times");
    }
}

