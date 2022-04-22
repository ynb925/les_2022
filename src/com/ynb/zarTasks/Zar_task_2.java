package com.ynb.zarTasks;

/**
 * Задача 2. По аналогии с предыдущим напиши программу которая выводит факториал числа.
 * Например если задать факториал 5ти то должно вывести 120.
 * 1!=1
 * 2!=2
 * 3!=6
 * 4!=24
 * 5!=120
 * 6!=720
 * 7!=5040
 * fact(m) = n * n-1 * n-2 * n-3....
 * fact(5) = 1 * 2 * 3 * 4 * 5
 * 001         3    2
 * int res = fact * i; = 6
 */

public class Zar_task_2 {
    public static void main(String[] args) {
        int fact = 7;

        for (int i = fact - 1; i > 0; i--) {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}



