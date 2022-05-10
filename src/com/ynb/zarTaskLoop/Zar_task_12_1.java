package com.ynb.zarTaskLoop;

import java.util.Scanner;

/**
 * 12_1 Тут нужно если не догонишь с чего начинать - сразу звони *
 * Напишите класс, который принимает с клавиатуры 10  целых чисел и выводит на экран информацию о том,
 * сколько из них бьmи положительными.
 */


public class Zar_task_12_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" how match we do: ");
        int quantity = scanner.nextInt();

        int number;
        int counter = 0;

        for (int i = 0; i < quantity; i++) {
            System.out.println(i + 1 + " enter num :  ");
            number = scanner.nextInt();

            if (number >= 0) {
                counter = counter + 1;
            }
        }
        System.out.print(counter);
    }
}


