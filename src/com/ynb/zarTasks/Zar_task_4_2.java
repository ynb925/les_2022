package com.ynb.zarTasks;

import java.util.Scanner;

/**
 * Задание 4.2 Напишите класс, который принимает с клавиатуры целое положитель ное трехзначное число и выводит на экран его цифры,
 * разделенные знаком «пробел»
 */

public class Zar_task_4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 3х-ное число: ");
        int n = scanner.nextInt();
        String str = Integer.toString(n);

        System.out.println("enter int => make to str:  " + str); // out result is convert INT to STR

        char c = str.charAt(0);
        char b = str.charAt(1);
        char q = str.charAt(2);

        System.out.println(c + "  " + b + "  " + q);   // out result is convert  STR to char and add "_"
    }
}
