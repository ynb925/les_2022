package com.ynb.zarTaskWhile;

import java.util.Scanner;

/**
 * Задание 15.35 УУУУХХХХПОДГОРИТ))))
 * Напишите класс, который принимает с клавиатуры целое положительное число
 * и строит из него число с обратным порядком цифр. Новое значение следует вывести на экран
 */

public class Zar_task_15_35_w {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" count of enter nums: ");
        int scanNum = scanner.nextInt();
        int numm = scanNum;

        while (numm > 0) {
            numm = scanNum - 1;
            scanNum = numm;

            System.out.println(numm);
        }
    }
}
