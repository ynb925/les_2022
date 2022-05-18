package com.ynb.zarTaskMethod;


import java.util.Scanner;

/**
 * Задание 17.13 Напишите метод, который принимает в качестве параметра два целых числа и возвращает значение true,
 * если в числах одинаковое количество цифр; в ином случае метод возвращает значение false.
 */
public class Zar_method_17_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" wrt 1st num : ");
        int scan1st = scanner.nextInt();

        System.out.println(" wrt 2nd num : ");
        int scan2nd = scanner.nextInt();

        System.out.println(getTrue(scan1st, scan2nd));

    }

    public static int checkNum1(int scan1st) {
        int div = 1;
        int value1 = 0;

        while (scan1st / div != 0) {
            div = div * 10;
            value1++;
        }
        return value1;
    }

    public static int checkNum2(int scan2nd) {
        int div = 1;
        int value2 = 0;

        while (scan2nd / div != 0) {
            div = div * 10;
            value2++;
        }
        return value2;
    }

    public static boolean getTrue(int value1, int value2) {
        if (value1 > value2) {
            return false;
        }
        if (value1 < value2) {
            return false;

        } else {
            return true;
        }
    }
}