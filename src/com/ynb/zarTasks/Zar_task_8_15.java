package com.ynb.zarTasks;

import java.util.Scanner;

/**
 * Задание 8.15 Напишите класс, который принимает с клавиатуры двузначное положительное число и проверяет,
 * какая из его двух цифр является большей.
 * В соответствии с результатом проверки надо вывести на экран соответствующее текстовое сообщение.
 * Не следует выводить на экран ни какого сообщения, если число составлено из одинаковых цифр.
 */

public class Zar_task_8_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 2x зна-ое положительное число : ");
        int n = scanner.nextInt();
        int a = n / 10;
        int b = n % 10;

        if (n > 0 && a != b) {
            System.out.println(" разные числа ");
        } else {

        }
    }
}