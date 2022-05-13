package com.ynb.zarTaskWhile;

import java.util.Scanner;

/**
 * Задание 11.17 Напишите класс, который выводит на экран в
 * строку положительные трехзначные числа, заканчивающиеся
 * на 7 (в возрастающем порядке). Числа должны отделяться
 * друг от друга знаком «пробел».
 */

public class Zar_task_11_17_w {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" enter num 1st : ");
        int n = scanner.nextInt();

        int i = 107;
        while (i <= n) {
            System.out.print(" " + i + " ");
            i = i + 10;
        }
    }
}
