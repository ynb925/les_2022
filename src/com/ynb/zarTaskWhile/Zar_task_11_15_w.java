package com.ynb.zarTaskWhile;

import java.util.Scanner;

/**
 * Задание 11.15 Напишите класс, который читает с консоли 1 число и выводит на экран в строку
 * все положительные четные числа (в возрастающем порядке) меньше за это число . Числа должны
 * отделяться друг от друга знаком «пробел». Перед началом вывода на экран (в отдельной строке)
 * следует вывести слово Старт, а после окончания вывода чисел (тоже в отдельной строке)-слово Финиш.
 */

public class Zar_task_11_15_w {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" enter num 1st : ");
        int n = scanner.nextInt();

        if (n % 2 == 0)
            System.out.print("start");
        int i = 0;
        while (i < n + 1) {
            System.out.print(" " + i + " ");
            i = i + 2;
        }
        System.out.print("finish");
    }
}
