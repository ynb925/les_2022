package com.ynb.zarTaskMethod;

import java.util.Scanner;

/**
 * Задание 17.11 Напишите метод, который принимает в качестве параметра
 * целое число и возвращает количество цифр в этом числе.
 */

public class Zar_method_17_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" put in  num : ");
        int value = scanner.nextInt();

        System.out.println(checkSymbols(value));
    }

    public static int checkSymbols(int value) {
        int countNums = 0;
        int div = 1;

        while (value / div != 0) {
            div = div * 10;
            countNums++;
        }
        return countNums;
    }
}
