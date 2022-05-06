package com.ynb.zarTasks;


/**
 * Задание 10.1   Напишите класс, который генерирует и выводит на экран случайное
 * целое чисел из диапазона положительных двузначных чисел.
 */

public class Zar_task_10_1_random_v1 {
    public static void main(String[] args) {

        int min = 10;
        int max = 99;
        int range = max - min + 1;
        int randomNumber = (int) (Math.random() * range) + min;
    }
}

/*

        int ranNum = (int) (Math.random() * 100);
        if (ranNum > 9 && ranNum < 100) {
            System.out.println(ranNum);
        } else
            System.out.println(ranNum + 10);
        }
}*/

