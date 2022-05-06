package com.ynb.zarTasks;

import java.util.Scanner;

/**
 * Задача 1.3  * Напишите программу, которая принимает поступления с консоли. Программа должна пройти тестирование
 * для следующих возрастных диапазонов: от 0 до 10, от 11 до 20, от 21 до 30, от 31 года и старше.
 * Отобразите сообщение в окне возраст +» это между 21 и 30 годами»  или «Вам более 30 лет»
 * Vnimanee! проверка на более чем 30 должна проводиться не явно. то есть вырадение вроде:
 * возраст >= 31, возраст > 30 не должны расти.
 */

public class Zar_task_1_3_sw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter your age :  ");
        int n = scanner.nextInt();
        switch (n) {
            case 1, 2, 3, 4, 5, 7, 8, 9, 10 -> System.out.println(" 1  year and more");
            case 11, 12, 13, 14, 15, 17, 18, 19, 20 -> System.out.println(" 10 year and more");
            case 21, 22, 23, 24, 25, 26, 27, 28, 29, 30 -> System.out.println(" 21 year and more");
            case 31 -> System.out.println("more 30 year");
            default -> System.out.println(" enter correct age");
        }
    }
}
