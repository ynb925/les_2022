package com.ynb.zarArrays;

import static com.ynb.zarArrays.CreateArray.createArr;
import static com.ynb.zarArrays.CreateArray.printArr;

/**
 * Задание 19.18 Напишите метод, который получает в качестве параметра массив
 * и и проверяет в масиве неубывающую последовательность (каждый элемент не меньше предыдущего).
 * Пример:
 * 1 2 5 9 9 12 99 - метод возвращает TRUE
 * 10 12 22 5 84 - метод возвращает FALSE
 */

public class Arr19_18 {
    public static void main(String[] args) {
        int[] arrSize = createArr(10, 100);

        printArr(arrSize);
        System.out.println(mirrorArray(arrSize));

    }

    public static boolean mirrorArray(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) {
                //   System.out.print("false");
                return false;
            }
        }
        //  System.out.println("true");
        return true;
    }
}
