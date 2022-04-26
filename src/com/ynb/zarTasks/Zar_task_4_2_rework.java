package com.ynb.zarTasks;

import java.util.Scanner;

/**
 * Задание 4.2 Напишите класс, который принимает с клавиатуры целое положительное трехзначное число и выводит на экран его цифры,
 * разделенные знаком «пробел»
 */

public class Zar_task_4_2_rework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 3х-ное число: ");
        int n = scanner.nextInt();

        int a = n / 100;   // we get 1st num
        int b = (n % 100) / 10;   // we get 2nd num
        int q = n % 10;   // we get 3th num

        System.out.println(a + "  " + b + "  " + q);   // out result is convert  STR to char and add "_"
    }
}
