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
        int scanNum;
        int resNums = 0;
        int countNums = 0;
        while (resNums < 151) {

            scanNum = scanner.nextInt();
            resNums = resNums + scanNum;

            countNums++;
        }
        System.out.println(countNums + " " + " nums " + " " + resNums);
    }
}
