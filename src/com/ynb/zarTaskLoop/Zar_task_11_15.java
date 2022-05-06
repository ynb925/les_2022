package com.ynb.zarTaskLoop;

import java.util.Scanner;

/**
 * Задание 11.15 Напишите класс, который читает с консоли 1 число и выводит на экран в строку
 * все положительные четные числа (в возрастающем порядке) меньше за это число . Числа должны
 * отделяться друг от друга знаком «пробел». Перед началом вывода на экран (в отдельной строке)
 * следует вывести слово Старт, а после окончания вывода чисел (тоже в отдельной строке)-слово Финиш.
 */

public class Zar_task_11_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" enter num 1st : ");
        int n = scanner.nextInt();

        if (n > 0 && n % 2 == 0)

            System.out.print("start");
        for (int i = 0; i <= n; i++) {
            System.out.print(" " + i + " ");

        }
        System.out.print("finish");
    }
}
