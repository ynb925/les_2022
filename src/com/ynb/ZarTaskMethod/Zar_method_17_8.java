package com.ynb.ZarTaskMethod;

import java.util.Scanner;

/**
 * Задание 17.8 Напишите метод, который принимает в качестве параметра число и возвращает:
 * • -1 -в случае если число отрицательное;
 * • 0 -в случае если число равно 0;
 * • 1 -в случае если число положительное.
 */

public class Zar_method_17_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" enter  num : ");
        int n = scanner.nextInt();
        int res = checkNum(n);

        System.out.println(res + " " + "num");
    }

    public static int checkNum(int n) {
        return Integer.compare(n, 0);
    }
}
