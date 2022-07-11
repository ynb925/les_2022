package com.ynb.zarArrays;

/**
 * Задание 19.51 Напишите метод, который принимает в качестве параметров
 * два массива целых чисел одинаковой длины. Метод возвращает массив,
 * содержащий значения массивов-параметров, записанные по правилу
 * «ПО очереди из параллельных ячеею>.
 * Например, для массивов
 * <p>
 * 1, 2, 3, 4  ||   6, 7, 8, 9
 * метод возвращает массив
 * 1, 6, 2, 7, 3, 8, 4, 9.
 */

public class Arr19_51 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4};
        int[] arr2 = new int[]{6, 7, 8, 9};

        aarsSortUp(arr1, arr2);
    }

    public static void aarsSortUp(int[] array1, int[] array2) {
        int[] arraynew = new int[array1.length + array2.length];

        for (int i = 0, j = 0; i < array1.length; i++, j += 2) {
            arraynew[j] = array1[i];
            arraynew[j + 1] = array2[i];
        }
        for (int j : arraynew) {
            System.out.print(j + "   ");
        }
    }

}

/*
        for (int i = -1, f = 0; i < array1.length - 1; i++, f++) {
            arraynew[i + i + 2] = array1[f];
        }
        for (int i = 0, s = 0; i < array2.length; i++, s++) {
            arraynew[i + i + 1] = array2[s];
        }
        for (int j : arraynew) {
            System.out.print(j + "   ");
        }
    }
}
*/
