package com.ynb.zarTasks;

import java.util.Scanner;

/**
 * Задание 4.7 Напишите класс, который принимает с клавиатуры целое положитель ное двузначное число.
 * Затем следует построить новое значение, со ставленное из цифр числа, введенного с клавиатуры,
 * но в обратном порядке. После этого новое значение следует увеличить на 8,
 * и окончательный результат вывести на экран. То есть для числа 37 следует построить число 73 и вывести на экран 81.
 */
public class Zar_task_4_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 2х-ное число: ");
        int n = scanner.nextInt();
        String str = Integer.toString(n);

        System.out.println("int to str:  " + str);           // out result is convert INT to STR

        char c = str.charAt(1);
        char b = str.charAt(0);

        System.out.println(c + "  " + b);                    // out result is convert  STR to char and add "_"  \ also make revers by numbers
        String s = Character.toString(c) + (b);              // char to string and make concatenation   |  ex: 3 7 => 37
        int res = Integer.parseInt(s);                    //  string to int without damage value     |  ex: 3+7 !=10  we make 37 !!!

        System.out.println(res + 8);
    }
}
