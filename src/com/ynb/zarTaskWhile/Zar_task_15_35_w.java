package com.ynb.zarTaskWhile;

import java.util.Scanner;

/**
 * Задание15.35УУУУХХХХПОДГОРИТ))))
 * Напишите класс,который принимает с клавиатуры целое положительное число
 * и строит из него число с обратным порядком цифр.Новое значение следует вывести на экран
 */

public class Zar_task_15_35_w {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" count of enter nums: ");
        int scanNum = scanner.nextInt();
        int numm = scanNum;
        int division = 1;

        if (numm % 10 == 0) {    // check for last symbol in numm was 0
            numm = numm / 10;
            scanNum = numm;
            System.out.print("0"); // make mirror if last symbol in numm was 0
        }
        while (numm > 0) {
            numm = (scanNum / division) % 10;
            division = division * 10;
            if (numm == 0) {
                System.out.print("");    // check num before print if last symbol in numm was 0
            } else {
                System.out.print(numm);
            }
        }
    }
}



