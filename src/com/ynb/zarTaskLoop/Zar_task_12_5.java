package com.ynb.zarTaskLoop;

import java.util.Scanner;

/**
 * Задание 12.5   Напишите класс, который генерирует 15 целых чисел в интервале от -25 до 25, печатает их,
 * а затем выводит на экран информацию о том, сколько из них были:
 * • положительными;
 * • четными;
 * • однозначными.
 */


public class Zar_task_12_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter range nums start: ");
        int numberRmin = scanner.nextInt();
        System.out.println(" enter range nums finish: ");
        int numberRmax = scanner.nextInt();

        System.out.println(" how match we do: ");
        int counter = scanner.nextInt();

        int counterPozNum = 0;
        int counterEvenNum = 0;
        int counterOneNum = 0;
        int number1;
        int tempNum = 0;

        for (int i = 0; i < counter; i++) {

            System.out.println(i + 1 + " enter num :  ");
            number1 = scanner.nextInt();

            if (number1 >= 0) {
                counterPozNum++;
            }
            if (number1 % 2 == 0) {
                counterEvenNum++;
            }
            if (number1 > -10 && 10 > number1) {
                counterOneNum++;

            }
        }
        System.out.println(counterPozNum + "   " + "num is pozitiv");
        System.out.println(counterEvenNum + "   " + "num is even %2");
        System.out.println(counterOneNum + "   " + "num is equivalent");
    }
}