package com.ynb.zarTasks;

import java.util.Scanner;

/**
 * Задание 10.4 Напишите класс, который принимает с клавиатуры целое положительное число,
 * а затем генерирует три целых положительных числа, меньших первого.
 */
public class Zar_task_10_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter num: ");
        int n = scanner.nextInt();

        int min = 10;
        int max = n;
        int range = max - min + 1;
        int randomNumber = (int) (Math.random() * range) + min;
        int randomNumber1 = (int) (Math.random() * range) + min;
        int randomNumber2 = (int) (Math.random() * range) + min;
        System.out.println(randomNumber);
        System.out.println(randomNumber1);
        System.out.println(randomNumber2);
    }
}