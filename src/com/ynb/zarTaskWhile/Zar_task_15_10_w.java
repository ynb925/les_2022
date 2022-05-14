package com.ynb.zarTaskWhile;

import java.util.Scanner;

/**
 * Напишите класс, который принимает с клавиатуры число для переменной Х, а затем дополнительную серию чисел,
 * каждое из которых используется для уменьшения значения переменной Х. Ввод чисел должен производиться до тех пор,
 * пока значение переменной Х остается положительным.
 */

public class Zar_task_15_10_w {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter Num: ");
        int scanNum = scanner.nextInt();
        int xNum = scanNum;
        int scanRes = 0;


        while (scanRes > 0) {
            scanRes = xNum - scanner.nextInt();
        }
        System.out.println(scanRes);
    }
}