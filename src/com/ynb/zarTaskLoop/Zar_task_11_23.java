package com.ynb.zarTaskLoop;

import java.util.Scanner;

/**
 * Задание 11.23 Напишите класс, который вначале принимает с клавиатуры целое положительное число (в переменную х),
 * которое будет количеством членов в арифметической прогрессии. Первый член прогрессии равен 7, а разница между
 * соседними членами прогрессии равна 4. Затем класс выводит на экран в строку серию из х членов этой прогрессии.
 * Числа должны отделяться друг от друга знаком «пробел». Перед началом и после окончания вывода серии чисел
 * на экран вывода следует вывести текстовые сообщения (по выбору).
 */

public class Zar_task_11_23 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" enter  num : ");
        int n = scanner.nextInt();

        int res = 7;
        System.out.print(res + " ");
        for (int i = 1; i < n; i++) {
            res = res + 4;
            System.out.print(res + " ");
        }
    }
}

