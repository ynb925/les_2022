package com.ynb.zarTaskLoop;

import java.util.Scanner;

/**
 * Задание 12.2  Напишите класс, который принимает с клавиатуры 15 целых чисел и
 * выводит на экран информацию о том, сколько из них были четными и сколько нечетными.
 * ПС если хочешь не вводить вручную, есть лайфхаки,
 */

public class Zar_task_12_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" how match we do: ");
        int quantity = scanner.nextInt();

        int number;
        int counterEven = 0;
        int counterOdd = 0;

        for (int i = 0; i < quantity; i++) {
            System.out.println(i + 1 + " enter num :  ");
            number = scanner.nextInt();

            if (number % 2 == 0) {
                counterEven++;
            } else {
                counterOdd++;
            }
        }
        System.out.print(counterEven + "   " + "even %2");
        System.out.print("     ");
        System.out.print(counterOdd + "   " + "odd not %2");
    }
}
