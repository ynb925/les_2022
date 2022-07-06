package com.ynb.zarArrays;

/**
 * Задание 19.39
 * Напишите метод, который принимает в качестве параметра массив целых чисел и «переворачивает» его.
 * Например, если в качестве параметра получен массив 1, 3, 6, 2, 7, после окончания работы метода
 * содержимое массива будет 7, 2, 6, 3, 1.
 */

public class Arr19_39 {
    public static void main(String[] args) {

        int[] arr = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println( arrReWrite(arr.length) );

    }

    public static int arrReWrite(int[] array) {
        int[] arraynew = new int[array.length];
        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
            arraynew[i] = array[j];
            System.out.print(arraynew[i] + " ");
        }

        return arraynew[arraynew.length];
    }
}