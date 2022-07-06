package com.ynb.zarArrays;

/**
 * Задание 19.34 Напишите метод, который принимает в качестве параметра массив целых чисел
 * и возвращает число ячеек массива, содержащих значения большие среднего арифметического массива.
 */

public class Arr19_34 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11,12, 13, 14, 15, 16, 17, 18,};
        System.out.println(arrayBigindex(array));
    }

    public static int arrayBigindex(int[] array) {
        int Sum = 0;
        int division = 0;
        int middleSum;

        for (int j : array) {
            division++;
            Sum += j;
        }
        middleSum = Sum / division;

        int countCell = 0;
        int counter = 0;
        for (int j : array) {
            if (j > middleSum) {
                countCell++;
            }
        }
        return countCell;
    }
}