package com.ynb.zarTaskMethod;

import java.util.Scanner;

/**
 * Задание 17.12 Напишите метод, который принимает в качестве параметра
 * целое число и возвращает самую большую цифру в этом числе.
 */

public class Zar_method_17_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" wrt your num : ");
        int value = scanner.nextInt();

        System.out.println(getMaxNum(value));
    }

    public static int getMaxNum(int value) {
        int div = 1;
        int getMax = 0;
        int temp;

        while (value / div != 0) {
            temp = (value / div) % 10;
            div = div * 10;

            if (getMax < temp) {
                getMax = temp;
            }
        }
        return getMax;
    }
}
