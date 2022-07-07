package com.ynb.zarArrays;

/**
 * Задание 19.39
 * Напишите метод, который принимает в качестве параметра массив целых чисел и «переворачивает» его.
 * Например, если в качестве параметра получен массив 1, 3, 6, 2, 7, после окончания работы метода
 * содержимое массива будет 7, 2, 6, 3, 1.
 */

public class Arr19_39 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 6, 2, 7};

        overturnArray(array);

        for (int j : array) {
            System.out.print(j + " ");
        }
    }

    public static void overturnArray(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) {

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}

