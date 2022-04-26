package com.ynb.zarTasks;

import java.util.Scanner;

/**
 * Задание 4.3 Напишите класс, который принимает с клавиатуры целое
 * положитель ное двузначное число и выводит на экран его цифры,
 * разделенные знаком «пробел», но в обратном порядке. То есть для
 * числа 45 будет выведено на экран 5 4.
 */

public class Zar_task_4_3_rework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 2х-ное число: ");
        int n = scanner.nextInt();
        int a = n % 10;   // we get 2nd num
        int b = n / 10;   // we get 1 num

        System.out.println(a + "  " + b);   // out result is convert  STR to char and add "_"  \ also make revers by numbers
    }
}

