package com.ynb.zarTaskWhile;

import java.util.Scanner;

/**
 * Задание 15.9 Напишите класс, который принимает с клавиатуры целое число,
 * а за тем выводит на экран последующие ему целые числа,
 * пока сумма этих чисел не превышает квадрата введенного числа.
 */

public class Zar_task_15_9_w {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter Num: ");
        int scanNum = scanner.nextInt();
        int resNums = 0;
        int multiNum = scanNum * scanNum;

        while (resNums < multiNum) {
            resNums = resNums + scanner.nextInt();

            System.out.println(" " + resNums);
        }
        System.out.println("finish");
    }
}
