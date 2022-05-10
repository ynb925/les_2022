package com.ynb.zarTaskLoop;

import java.util.Scanner;

/**
 * Задание 12.4 Напишите класс, который принимает с клавиатуры 17 целых чисел и
 * выводит на экран информацию о том, сколько из них были больше, чем предыдущее число.
 * enter 0 2 1 4 => 2 ()
 */


public class Zar_task_12_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" how match we do: ");
        int number = scanner.nextInt();

        int newNumm = 0;
        int count = 0;

        for (int i = 0; i < number; i++) {
            System.out.println(i + 1 + " enter num :  ");
            int number1 = scanner.nextInt();

            if (number1 > newNumm) {
                count++;
                newNumm = number1;
            }
        }
        System.out.println(count + "   " + "times num was max");
    }
}