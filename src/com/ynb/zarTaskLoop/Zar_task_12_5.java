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
        int numberMin = scanner.nextInt();
        System.out.println(" enter range nums finish: ");
        int numberMax = scanner.nextInt();

        System.out.println(" how match we do: ");
        int counter = scanner.nextInt();

        int counterPozNum = 0;
        int counterEvenNum = 0;
        int counterOneNum = 0;
        int counterOutNum = 0;
        int number;

        for (int i = 0; i < counter; i++) {

            System.out.println(i + 1 + " enter num :  ");
            number = scanner.nextInt();

            if (number >= 0 && 0 <= numberMax) {
                counterPozNum++;
            }
            if (number % 2 == 0 && numberMin < number && number < numberMax) {
                counterEvenNum++;
            }
            if (number > -10 && 10 > number) {
                counterOneNum++;
            } else {
                counterOutNum++;
            }
        }
        System.out.println(counterPozNum + "   " + "num is pozitiv");
        System.out.println(counterEvenNum + "   " + "num is even %2");
        System.out.println(counterOneNum + "   " + "num is equivalent");
        System.out.println(counterOutNum + "   " + "num is out rules");
    }
}