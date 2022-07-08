package com.ynb.zarArrays;

/**
 * Задание 19.45 Напишите метод, который принимает в качестве параметра массив целых чисел и
 * сдвигает все элементы массива, кроме последнего, на одну позицию вправо. Значение, находившееся
 * в последней ячейке массива, переходит в первую ячейку (правый сдвиг).
 * пример 1 2 3 4 5 -> 5 1 2 3 4
 */

public class Arr19_45 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};

        int temp;
        for (int i = arr.length - 1; i > 0; i--) {
            temp = arr[i - 1];
            arr[i - 1] = arr[i];
            arr[i] = temp;
        }
        for (int j : arr)
            System.out.print(j + " ");
    }
}