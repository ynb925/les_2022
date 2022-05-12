package com.ynb.zarTaskLoop;

import java.util.Scanner;

/**
 * Задание 11.24 Напишите класс, который вначале принимает с клавиатуры целое положительное число (в переменную х).
 * Затем класс выводит на экран в строку серию из 2х убывающих чисел, начиная с О; разница между соседними значениями в серии равна 8.
 * Числа должны отделяться друг от друга знаком «пробел». Перед началом и после окончания вывода серии чисел на экран
 * вывода следует вывести текстовые сообщения (по выбору).
 */


public class Zar_task_11_24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" enter  num : ");
        int n = scanner.nextInt();

        for (int i = 0; i >= n-n *3; i = i - 8) {

            System.out.print(i + " ");
        }
    }
}
