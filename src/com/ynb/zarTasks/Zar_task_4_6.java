package com.ynb.zarTasks;

import java.util.Scanner;

/**
 * Задание 4.6 Напишите класс, который принимает с клавиатуры целое положитель ное трехзначное число и выводит его на экран
 * в «полном виде»: на пример, для числа 364 это будет выглядеть как 300+60+4.
 */
public class Zar_task_4_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 3х-ное число: ");
        int n = scanner.nextInt();
        String str = Integer.toString(n);

        System.out.println("enter int => make to str:  " + str); // out result is convert INT to STR

        char c = str.charAt(0);
        char b = str.charAt(1);
        char q = str.charAt(2);

        System.out.println(c + "00" + "+" + b + "0" + "+" + q);   // out result is convert  STR to char and add "_"
    }
}
