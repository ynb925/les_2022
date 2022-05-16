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
        String str = Integer.toString(scanNum);
        String numm = str;
        int division = 3;
        int res = 0;
        int count = 0;
        String s = "";

        while (scanNum > 0) {


            res = (Integer.parseInt(str) / division) % 10;
            char symbol = str.charAt(division);
            s = s + (Character.toString(symbol));
            res = Integer.parseInt(s);
            System.out.print(res);

        }
    }
}

