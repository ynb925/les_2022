package com.ynb.zarTasks;

import java.util.Scanner;

/**
 * Задача 1.4 от себя.   Меня в университете учили так 1 2 3 а дальше много. я был умным и учтенным до 10.
 * И так - дочитай до 10 от введенного числа. если число больше 10, выводишь надпись "много".
 * если меньше 1 выводишь надпись "мало 1 2 3 4 5 6 7 8 9 10 много".
 * Например вводишь число 4, на выводе получаешь -> 4 5 6 7 8 9 10 много.
 * И напоминаю - часто свитч. Приятного горения пердака)
 */

public class Zar_task_1_4_sw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter some num :  ");
        int n = scanner.nextInt();
        switch (n) {
            case 1, 2, 3 -> System.out.println(" мало 1 2 3 4 5 6 7 8 9 10 много ");
            case 4, 5, 7, 8, 9, 10 -> System.out.println("4 5 6 7 8 9 10 много");
            default -> System.out.println(" enter correct num");
        }
    }
}