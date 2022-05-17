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

        checkNumEven(start, finish);
    }

    public static void checkNumEven(int start, int finish) {
        if (start % 2 != 0) {
            start = start + 1;
        }
        while (start <= finish) {
            start += 2;
            System.out.print(start + " ");
        }
    }
}


//    public static void checkNumEven(int start, int finish) {
//        if (start % 2 != 0) {
//            start = start + 1;
//            cycleNumCalc(start, finish);
//        } else {
//            cycleNumCalc(start, finish);
//        }
//    }
//
//    public static void cycleNumCalc(int start, int finish) {
//        while (start <= finish) {
//            start += 2;
//            System.out.print(start + " ");
//        }
//    }
//   }