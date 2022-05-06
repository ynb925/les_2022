package com.ynb.zarTasks;

/**
 * Задание 10.2   Напишите класс, который генерирует и выводит на экран случайное целое чисел
 * из диапазона положительных и отрицательных двузначных чисел.
 */

public class Zar_task_10_2 {
    public static void main(String[] args) {

        int min = -100;
        int max = 100;
        int range = max - min + 1;
        int randomNumber = (int) (Math.random() * range) + min;
        System.out.println(randomNumber);
    }
}
