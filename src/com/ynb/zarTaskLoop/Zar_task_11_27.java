package com.ynb.zarTaskLoop;

import java.util.Scanner;

/**
 * Задание 11.27 звучит интерестно, по желанию
 * Напишите класс, который принимает с клавиатуры целое положительное число, а затем выводит на экран все целые положительные
 * двузначные числа, сумма цифр которых равна введенному с клавиатуры значению.
 */


public class Zar_task_11_27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" enter  num : ");
        int n = scanner.nextInt();

        int range1 = 10;
        int range2 = 99;
        int r1;
        int r2;
        int res;


        for (int i = range1; i <= range2; i++) {
            r1 = i / 10;
            r2 = i % 10;
            res = r1 + r2;
            if (res == n) {
                System.out.println(i);
            }
        }
    }
}
