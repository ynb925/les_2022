package com.ynb.zarTaskLoop;

import java.util.Scanner;

/**
 * Задание 12.4 Напишите класс, который принимает с клавиатуры 17 целых чисел и
 * выводит на экран информацию о том, сколько из них были больше, чем предыдущее число.
 */


public class Zar_task_12_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" how match we do: ");
        int quantity = scanner.nextInt();

        int number;
        int numOld;
        int counter_min = 0;
        int counter_max = 0;

        for (int i = 0; i < quantity; i++) {
            System.out.println(i + 1 + " enter num :  ");
            number = scanner.nextInt();
            numOld = number++;

            if (number < numOld || number > numOld) {
                counter_min = counter_min + 1;
            } else {
                counter_max = counter_max + 1;
            }
        }
        System.out.print(counter_min + "   " + "min");
        System.out.print("     ");
        System.out.print(counter_max + "   " + "max");
    }
}