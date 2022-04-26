package com.ynb.zarTasks;

import java.util.Scanner;

/**
 * Задание 4.6 Напишите класс, который принимает с клавиатуры целое положитель ное трехзначное число и выводит его на экран
 * в «полном виде»: на пример, для числа 364 это будет выглядеть как 300+60+4.
 */

public class Zar_task_4_6_rework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 3х-ное число: ");
        int n = scanner.nextInt();

        int a = n / 100;   // we get 1st num
        int b = (n % 100) / 10;   // we get 2nd num
        int c = n % 10;   // we get 3th num

        System.out.println(a + "00" + "+" + b + "0" + "+" + c);   // out result is convert  STR to char and add "_"
    }

}
