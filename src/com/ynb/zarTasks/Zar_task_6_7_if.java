package com.ynb.zarTasks;

import java.util.Scanner;

/**
 * Задание 6.7
 * Напишите класс, который принимает с клавиатуры целое положительное число и,
 * если оно как минимум трехзначное и положительное, уменьшает его на 1.
 */

public class Zar_task_6_7_if {
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
        } //check if number is big
        if (n > 0 && n >= 100) {
            System.out.println((n - 1) + " is a big num.");
        }
    }
}


