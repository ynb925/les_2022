package com.ynb.zarTasks;

/**
 * Задача 4. По аналогии с предыдущим заданием все непарные числа.
 * Тест кейсы, от 3 до 13, от -1 до 2, от 0 до 6. Везде включительно.
 */

public class Zar_task_4 {
    public static void main(String[] args) {
        int start = -1;
        int finish = 2;

        for (int c = start; c <= finish; c++) {
            System.out.println(c % 3); // out all numbers %3
        }
    }
}
