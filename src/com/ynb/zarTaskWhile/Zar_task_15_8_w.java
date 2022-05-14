package com.ynb.zarTaskWhile;

import java.util.Scanner;

/**
 * Задание 15.8 Напишите класс, который принимает с клавиатуры значения, пока их сумма остается меньше 150.
 * По окончании ввода следует вывести на экран информацию о количестве введенных значений и их сумме.
 */
public class Zar_task_15_8_w {
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
