package com.ynb.zarArrays;


import static com.ynb.zarArrays.CreateArray.*;
import static com.ynb.zarArrays.CreateArray.*;

/**
 * Задание 19.20 Напишите метод, который получает в качестве параметра
 * массив и проверяет есть ли там повторяющиеся элементы.
 * Если есть - возвращает TRUE
 */
public class Arr19_20 {
    public static void main(String[] args) {
        int[] arrSize = createArr(10, 30);

        printArr(arrSize);
        System.out.println(equalNumArr(arrSize));

    }

    public static boolean equalNumArr(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                return true;
            }
        }
        return false;
    }
}