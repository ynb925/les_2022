package com.ynb.zarTaskLoop;

import java.util.Scanner;

/**
 * Задание 11.20 Напишите класс, который выводит на экран в строку положительные трехзначные числа,
 * делящиеся на 80 с остатком 45 (в возрастающем порядке). Числа должны отделяться друг от друга знаком «пробел».
 * Перед началом и после окончания вывода серии чисел на экран вывода следует вывести текстовые сообщения (по выбору).
 */

public class Zar_task_11_20 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" enter 3th num : ");
        int n = scanner.nextInt();

        for (int i = 45; i <= n; i = i + 80) {
            System.out.print(i + " ");
        }
    }
}

