package com.ynb.zarArrays;

/**
 * Задание 19.30 Напишите метод, который принимает в качестве параметра
 * массив и проверяет, являются ли его элементы упорядоченными по возрастанию.
 */

public class Arr19_30 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 6, 7, 8, 9, 10};
        System.out.println(arrayOrder(array));
    }

    public static boolean arrayOrder(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                return false;
            }
        }
        return true;
    }
}