package com.ynb.zarTasks;

import java.util.Scanner;

/**
 * Задание 4.1 Напишите класс, который принимает с клавиатуры целое положитель ное двузначное число и выводит на экран его цифры,
 * разделенные знаком «пробел».
 */

public class Zar_task_4_1_rework {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 2х-ное число: ");
        int n = scanner.nextInt();

        int a = n / 10;   // we get 1st num
        int b = n % 10;   // we get 2nd num

        System.out.println(b + " " + a);
    }
}

