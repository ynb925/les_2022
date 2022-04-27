package com.ynb.zarTasks;

import java.util.Scanner;

/**
 * Задание 6.11  Напишите класс, который принимает с клавиатуры два целых числа и,
 * если оба имеют одинаковый знак, на экран выводится сообщение Один
 * и тот же знак, а если разный, то на экран выводится сообщение Разные знаки.
 * Если же хотя бы одно из чисел равно О, выводится сообщение Некорректно.
 */

public class Zar_task_6_11_if {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 1st число: ");
        int n1 = scanner.nextInt();
        System.out.println("Введите 2nd число: ");
        int n2 = scanner.nextInt();

        //check if number is positive
        if ((n1 > 0 && n2 > 0) || (n1 < 0 && n2 < 0)) {
            System.out.println(" Tот же знак ");
        }
        //check if number is negative
        if ((n1 < 0 && n2 > 0) || (n1 > 0 && n2 < 0)) {
            System.out.println(" Разные знаки ");
        } //check if number is zero
        if (n1 == 0 || n2 == 0) {
            System.out.println(" Некорректно ");
        }
    }
}

