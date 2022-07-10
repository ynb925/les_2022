package com.ynb.zarArrays;

/**
 * Задание 19.44 Напишите метод, который принимает в качестве параметра
 * массив целых чисел и сдвигает все элементы массива,
 * кроме первого, на одну позицию влево. Значение, находившееся
 * в начальной ячейке массива, переходит в последнюю ячейку (левый сдвиг).
 * <p>
 * пример 1 2 3 4 5 -> 2 3 4 5 1
 */

public class Arr19_44 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};

        arrMoveRight(arr);
    }

    private static void arrMoveRight(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        for (int j : arr)
            System.out.print(j + " ");
    }
}
