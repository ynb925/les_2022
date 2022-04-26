package com.ynb.zarTasks;

import java.util.Scanner;

/**
 * Задание 4.7 Напишите класс, который принимает с клавиатуры целое положитель ное двузначное число.
 * Затем следует построить новое значение, со ставленное из цифр числа, введенного с клавиатуры,
 * но в обратном порядке. После этого новое значение следует увеличить на 8,
 * и окончательный результат вывести на экран. То есть для числа 37 следует построить число 73 и вывести на экран 81.
 */

public class Zar_task_4_7_rework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 2х-ное число: ");
        int n = scanner.nextInt();
        int a = n % 10;   // we get 2nd num
        int b = n / 10;   // we get 1 num
        int res = (a * 10) + b;

        System.out.println(res + 8);
    }
}