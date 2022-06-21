package com.ynb.zarArrays;

import java.util.Random;
import java.util.Scanner;

/**
 * Задание 19.7 Напишите метод, который получает в качестве параметра массив и заполняет его
 * случайными числами в диапазоне О ... 99. (масив должен быть на 100 елемментов).
 * <p>
 * ПС: тут кстати впервые встречаэться работа с ссылочными типами. Можно обговорить.
 * Гуглить прийдеться, ну если не долго, то не понятно.
 */

public class Arr19_7 {
    public static void main(String[] args) {

        Random random = new Random();
        int randomSize = random.nextInt(1, 20);
        int[] arr = new int[randomSize];
        randomArray(arr);
    }

    public static void randomArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0, 100);
            System.out.print(array[i] + " ");
        }
    }
}
