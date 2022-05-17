package com.ynb.ZarTaskMethod;

import java.util.Scanner;

/**
 * Задание 17.9 Напишите метод, который получает в качестве параметра два числа (А и В)
 * и выводит на экран все четные числа из диапазона А ... В.
 */

public class Zar_method_17_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" put in 1st num : ");
        int start = scanner.nextInt();

        System.out.println(" put in 2nd num : ");
        int finish = scanner.nextInt();

        System.out.println(checkNumEven(start,finish));


    }

    public static int checkNumEven(int start, int finish) {

        int i;
        i = start;
        while (start <= finish) {
            i++;
        }
        return i;
    }
}