package com.ynb.zarTasks;

import java.util.Scanner;

/**
 * Задание 3.2 Во многих странах для измерения небольших размеров используется не только единица длины «сантиметр»,
 * но и такая единица, как «дюйм>> (1дюйм=2.54 сантиметра). Напишите класс, который принимает с клавиатуры значение,
 * равное размеру в сантиметрах, и затем подсчитывает и выводит на экран это же значение, но в дюймах.
 */

public class Zar_task_3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inch = 2.54;

        System.out.print("Введите число в 'сантиметрах' ");
        if (scanner.hasNextDouble()) {
            double value = scanner.nextDouble();
            double inchPrint = value * inch;
            System.out.println(inchPrint + " дюйм");
        } else {
            System.out.println("Не тот тип данных, введите число!");
        }
        scanner.close();
    }
}
