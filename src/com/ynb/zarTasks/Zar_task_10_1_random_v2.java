package com.ynb.zarTasks;


import java.util.Random;

/**
 * Задание 10.1   Напишите класс, который генерирует и выводит на экран случайное
 * целое чисел из диапазона положительных двузначных чисел.
 */

public class Zar_task_10_1_random_v2 {
    public static void main(String[] args) {
        Random ranNum = new Random();
        int num;

        for (int i = 10; i < 100; i++) {
            num = ranNum.nextInt(90) + 10;
            System.out.println(num);
        }
    }
}
