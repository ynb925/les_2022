package com.ynb.zarArrays;

/**
 * Задание 19.37 Напишите метод, который принимает в качестве параметра массив целых чисел и
 * возвращает порядковый номер ячейки, содержащей максимальное значение.
 * Если в массиве есть несколько ячеек, содержащих максимальное значение,
 * метод вернет порядковый номер первой из них.
 */

public class Arr19_37 {
    public static void main(String[] args) {

        int[] array = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 12};
        biggestValue(array);
    }

    public static void biggestValue(int[] array) {

        int bigValue = 0;
        int index = 0;

        for (int j : array) {
            if (bigValue < j) {
                bigValue = j;
                index++;
            }
        }
        System.out.println(index + " " + bigValue);
    }
}

