package com.ynb.zarTaskWhile;

import java.util.Scanner;

/**
 * 14_1 Напишите класс который принимает n целых чисел и выводит самое меньшее и самое большее.
 * Эту задачу решишь сначала вайлом,  !!!!!!!!     а потом фором
 */

public class Zar_task_14_1_wRework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" count of enter nums: ");
        int n = scanner.nextInt();

        int minNum = 0;
        int maxNum = 0;

        System.out.println(1 + " enter some nums: ");
        int firstNum = scanner.nextInt();
        minNum = firstNum;
        maxNum = firstNum;

        int i = 1;
        while (i < n) {
            System.out.println(i + 1 + " enter some nums: ");
            int someNums = scanner.nextInt();

            if (minNum > someNums) {
                minNum = someNums;
            }
            if (maxNum < someNums) {
                maxNum = someNums;
            }
            i++;
        }
        System.out.println(minNum + "  " + maxNum);
    }
}
