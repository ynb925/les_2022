package com.ynb.zarTasks;

import java.util.Scanner;

/**
 * Задание 4.3 Напишите класс, который принимает с клавиатуры целое
 * положитель ное двузначное число и выводит на экран его цифры,
 * разделенные знаком «пробел», но в обратном порядке. То есть для
 * числа 45 будет выведено на экран 5 4.
 */

public class Zar_task_4_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 2х-ное число: ");
        int n = scanner.nextInt();
        String str = Integer.toString(n);

        System.out.println("int to str:  " + str); // out result is convert INT to STR

        char c = str.charAt(1);
        char b = str.charAt(0);

        System.out.println(c + "  " + b);   // out result is convert  STR to char and add "_"  \ also make revers by numbers
    }
}

