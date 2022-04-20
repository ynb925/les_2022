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
        int m = n / 10; //кол-во десятков
        int c = n - m * 10; //количество единиц
        char c1 = (char) scanner.nextInt();
        String res = String.valueOf (c1);
        System.out.println("Количество десятков: " + m);
        System.out.println("Количество единиц: " + c);
        System.out.println("Результат: " + res);
    }
}
