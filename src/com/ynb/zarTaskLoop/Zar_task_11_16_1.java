package com.ynb.zarTaskLoop;

import java.util.Scanner;

/**
 * Задание 11.16.1  Напишите класс, который читает с консоли 1 число и выводит на экран в строку все
 * положительные двузначные числа (в возрастающем порядке). Числа должны отделяться друг от друга знаком «пробел».
 * Рядом с числом, которое делится на 4, следует вывести знак «#» (решетка) без пробела между числом и знаком.
 */

public class Zar_task_11_16_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" enter num 1st : ");
        int n = scanner.nextInt();

        for (int i = 0; i <= n; i++) {

            if (i % 4 == 0) {
                System.out.print(i + "#");
            } else {
                System.out.print(" " + i + " ");
            }
        }
    }
}


