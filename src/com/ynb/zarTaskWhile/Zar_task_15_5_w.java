package com.ynb.zarTaskWhile;

import java.util.Scanner;

/**
 * Задание 15.5  Напишите класс, который принимает с клавиатуры числа,
 * пока не будет введено значение 999.
 * Класс должен подсчитать, сколько значений было введено с клавиатуры
 * (не считая значения 999), и вывести эту информацию на экран.
 */

public class Zar_task_15_5_w {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" count of enter nums: ");

        int a = 0;
        int countIter = 0;

        do {
            countIter++;
        } while ((a = scanner.nextInt()) != 999);
        System.out.println(countIter - 1);
    }
}


