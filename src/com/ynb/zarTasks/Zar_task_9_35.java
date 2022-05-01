package com.ynb.zarTasks;

import java.util.Scanner;

/**
 * Задание 9.35 (Тут есть нюансы по работе с char, можем обговорить).
 * Напишите класс, который читает с клавиатуры символ и проверяет, является ли введенный символ буквой латинского алфавита.
 * По результатам проверки следует вывести на экран соответствующее сообщение.
 */

public class Zar_task_9_35 {
    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);
        System.out.println("Введите букву лат алф : ");
        char c = Scanner.next().charAt(0);
        int n = c;
        System.out.println(n + " " + c);
        // A - 65 , Z - 90 ;    a - 97 , z - 122.
        if (n >= 65 && n <= 90 || n >= 97 && n <= 122) {

            System.out.println("is a latinium alfavit");
        }
    }
}