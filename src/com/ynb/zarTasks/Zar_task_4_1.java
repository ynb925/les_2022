package com.ynb.zarTasks;

import java.util.Scanner;

/**
 * Задание 4.1 Напишите класс, который принимает с клавиатуры целое положитель ное двузначное число и выводит на экран его цифры,
 * разделенные знаком «пробел».
 */

public class Zar_task_4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 2х-ное число: ");
        int n = scanner.nextInt();
        String str = Integer.toString(n);

        char c = str.charAt(0);
        char b = str.charAt(1);

        System.out.println(c + "  " + b);   // out result is convert  STR to char and add "_"
    }
}


