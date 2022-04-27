package com.ynb.zarTasks;

import java.util.Scanner;

/**
 * Задание 7.11 Напишите класс, который принимает с клавиатуры два различных числа.
 * Класс должен вывести на экран эти числа в порядке возрастания -в одной строке,
 * а в другой -их же, но в порядке убывания.
 */

public class Zar_task_7_11_if {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число #1: ");
        int n1 = scanner.nextInt();
        System.out.println("Введите число #2: ");
        int n2 = scanner.nextInt();

        if (n1 > n2) {
            System.out.println(n2 + " " + n1);
            System.out.println(n1 + " " + n2);
        } else {
            System.out.println(n1 + " " + n2);
            System.out.println(n2 + " " + n1);
        }
    }
}
