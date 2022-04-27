package com.ynb.zarTasks;

import java.util.Scanner;

/**
 * Задание 6.6 Напишите класс, который принимает с клавиатуры целое число и выводит на экран
 * одно из следующих сообщений: Положительное, или Отрицательное, или Ноль, -в зависимости от значения числа.
 */

public class Zar_task_6_6_if {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = scanner.nextInt();

        //check if number is positive
        if (n > 0) {
            System.out.println(n + " is positive.");
        }
        //check if number is negative
        if (n < 0) {
            System.out.println(n + " is negative.");
        } //check if number is zero
        if (n == 0) {
            System.out.println(n + " is zero.");
        }
    }
}

