package com.ynb.zarArrays;

import java.util.Random;
import java.util.Scanner;

/**
 * Задание 19.22 Напишите метод, который принимает два параметра: массив целых чисел М и еще одно целое число Х.
 * Метод возвращает количество ячеек массива М, содержащих значение Х (число появлений Х в М).
 * input {1,2,3,4} , int x=23   ||   output prt : 4 cell and num =23
 */
public class Arr19_22 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] arr = new int[scanner.nextInt()];
        int Xnum = scanner.nextInt();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10, 20);
            System.out.println(arr[i] + " ");
            System.out.println("--------------------------------");
        }
        System.out.println(arrСontain(arr, Xnum));
    }

    public static int arrСontain(int[] array, int value) {
        int counter = 0;

        for (int j : array) {
            if (value == j) {
                counter++;
            }
        }
        return counter;
    }
}
