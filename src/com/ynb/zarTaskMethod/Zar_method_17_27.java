package com.ynb.zarTaskMethod;


import java.util.Scanner;

/**
 * Задание 17.27 Напишите метод, который принимает в качестве параметра целое
 * положительное число n и возвращает значение факториала (n!).
 */


public class Zar_method_17_27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" wrt 1st num : ");
        int scanNum = scanner.nextInt();

        System.out.println(makeFactorial(scanNum));

    }

    public static int makeFactorial(int factorial) {
        int count = factorial - 1;

        while (count > 0) {
            factorial = factorial * count;
            count--;
        }
        return factorial;
    }
}

