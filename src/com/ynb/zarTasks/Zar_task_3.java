package com.ynb.zarTasks;

/**
 * Задача 3. Выведи с новой строки все парные числа  с промежутка от min до max.
 * Тест кейсы, от 3 до 13, от -1 до 2, от 0 до 6. Везде включительно.
 */

//  !!!!!!!!!!!!!!!!!!!!!!!

public class Zar_task_3 {
    public static void main(String[] args) {
        int start = -3;
        int finish = 3;

        for (int i = start; i <= finish; i++) {
            System.out.println(i); // out all numbers from Start to Finish
        }
        System.out.println();
        for (int b = start; b <= finish; b++) {
            if (b % 2 == 0 && b != 0) {
                System.out.println(b + " even Numbers"); // out all numbers  even Numbers
            }
        }
        System.out.println();
        for (int c = start; c <= finish; c++) {
            if (c % 2 != 0)
                System.out.println(c + " odd Numbers"); // out all numbers  odd  Numbers
        }
    }
}
