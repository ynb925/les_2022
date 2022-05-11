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
        int number = scanner.nextInt();

        int counterEven = 0;
        int counterOdd = 0;
        int newNumm = 0;
        int count = 0;
        int temp = 0;

        for (int i = 0; i < number; i++) {
            System.out.println(temp + 1 + " enter num :  ");
            temp++;
            int number1 = scanner.nextInt();

            if (number1 > newNumm && number1 >= numberRmin && number1 <= numberRmax) {
                count++;
                newNumm = number1;
            } else if (number1 % 2 == 0 && number1 >= numberRmin && number1 <= numberRmax) {
                counterEven++;
            } else if (number1 % 2 != 0 && number1 >= numberRmin && number1 <= numberRmax) {
                counterOdd++;
            }
        }
        System.out.println(count + "   " + "times num was max");
        System.out.println(counterEven + "   " + "even %2");
        System.out.println(counterOdd + "   " + "odd not %2");
    }
}