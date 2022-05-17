package com.ynb.ZarTaskMethod;

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

        int div = 1;
        int summa = 0;
        int countNums = 0;

        checkSymbols(value, div, summa, countNums);
    }

    public static void checkSymbols(int value, int div, int summa, int countNums) {
        while (value / div != 0) {

            summa = (value / div) % 10;
            div = div * 10;

            countNums++;
        }
        System.out.println(countNums);
    }
}
