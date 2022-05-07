package com.ynb.zarTaskLoop;

import java.util.Scanner;

/**
 * Задание 11.17 Напишите класс, который выводит на экран в строку положительные трехзначные числа, заканчивающиеся
 * на 7 (в возрастающем порядке). Числа должны отделяться друг от друга знаком «пробел».
 */

public class Zar_task_11_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" enter 3th num : ");
        int n = scanner.nextInt();

        if (n / 100 == 1) {
        }
        for (int i = 107; i <= n; i = i + 10) {
            System.out.print(i + " ");
        }
    }
}
