package com.ynb.zarTaskLoop;

import java.util.Scanner;

/**
 * Задание 11.14 Напишите класс, который читает с консоли 2 числа и выводит на экран в строку
 * все положительные числа (в возрастающем порядке) с этого диапазона. Числа должны отделяться
 * друг от друга знаком «пробел». Перед началом вывода на экран (в отдельной строке) следует
 * вывести слово Старт, а после окончания вывода чисел (тоже в отдельной строке)-слово Финиш.
 */

public class Zar_task_11_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" enter num 1st : ");
        int n1 = scanner.nextInt();

        System.out.println(" enter num 2nd : ");
        int n2 = scanner.nextInt();

        if (n1 > 0 && n2 > 0)

            System.out.print("start");
        for (int i = n1; i < n2; i++) {
            System.out.print(" " + i + " ");

        }
        System.out.print("finish");
    }
}


