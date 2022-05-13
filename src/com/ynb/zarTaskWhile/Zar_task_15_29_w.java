package com.ynb.zarTaskWhile;

import java.util.Scanner;

/**
 * Задание 15.29 Напишите класс, который принимает с клавиатуры целое число и подсчитывает сумму
 * его цифр. Результат подсчета должен быть выведен на экран. Например,
 * для чис ла 534 на экран будет выведено 12.
 */


public class Zar_task_15_29_w {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" count of enter nums: ");
        int n = scanner.nextInt();

        int a = n / 100;
        int b = (n % 100) / 10;
        int c = n % 10;
        int res = a + b + c;
        System.out.println(res);
    }
}