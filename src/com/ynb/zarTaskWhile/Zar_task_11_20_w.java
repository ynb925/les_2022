package com.ynb.zarTaskWhile;

import java.util.Scanner;

/**
 * Задание 11.20 Напишите класс, который выводит на экран в строку положительные трехзначные числа,
 * делящиеся на 80 с остатком 45 (в возрастающем порядке). Числа должны отделяться друг от друга знаком «пробел».
 * Перед началом и после окончания вывода серии чисел на экран вывода следует вывести текстовые сообщения (по выбору).
 */

public class Zar_task_11_20_w {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" in 000 nums : ");
        int n = scanner.nextInt();

        int i = 125;
        while (i < n && i > 0) {
            System.out.print(i + " ");
            i = i + 80;
        }
    }
}