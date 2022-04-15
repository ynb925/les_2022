package com.ynb.zarTasks;

/**
 * Задача 3. Выведи с новой строки все парные числа  с промежутка от min до max.
 * Тест кейсы, от 3 до 13, от -1 до 2, от 0 до 6. Везде включительно.
 */

//  !!!!!!!!!!!!!!!!!!!!!!!

public class Zar_task_3 {
    public static void main(String[] args) {
        int start = -1;
        int finish = 2;

        for (int i = start; i <= finish; i++) {
            System.out.println(i); // out all numbers from start tp finish
        }
        System.out.println();
        for (int b = start; b <= finish; b++) {

            System.out.println(b % 2); // out all numbers %2
        }
    }
}