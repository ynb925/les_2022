package com.ynb.zarTaskWhile;

import java.util.Scanner;

/**
 * Задание 15.35 УУУУХХХХПОДГОРИТ))))
 * Напишите класс, который принимает с клавиатуры целое положительное число
 * и строит из него число с обратным порядком цифр. Новое значение следует вывести на экран
 */

public class Zar_task_15_35_w_fix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" count of enter nums: ");
        int scanNum = scanner.nextInt();
        int res = 0;
        int tem;
        int div = 10;

        while (scanNum / div != 0) {
            tem = (scanNum / div) % 10;

            res = res * 10 + tem;
            div = div * 10;
        }
        System.out.println(res);
    }
}

