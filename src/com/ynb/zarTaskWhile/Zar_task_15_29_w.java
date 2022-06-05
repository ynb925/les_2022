package com.ynb.zarTaskWhile;

import java.util.Scanner;

/**
 * Задание 15.29 Напишите класс, который принимает с клавиатуры целое число и подсчитывает сумму
 * его цифр. Результат подсчета должен быть выведен на экран.
 * Например, для чис ла 534 на экран будет выведено 12.
 */


public class Zar_task_15_29_w {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter nums 2x symbols: ");
        int inputNum = scanner.nextInt();

        int division = 1;
        int sum = 0;

        while (inputNum / division != 0) {             // (inpun != 0)

            sum = sum + (inputNum / division) % 10;    // sum += inputNum % 10;
            division = division * 10;                  // inputNum /= 10;
        }
        System.out.println(sum);
    }
}

      /* int res1 = (inputNum % 10);
        int res2 = (inputNum / 10) % 10;
        int res3 = (inputNum / 100) % 10;
        int res4 = (inputNum / 1000) % 10;
        int res5 = (inputNum / 10000) % 10;

        System.out.println(res1 + " this is sum" + "res1");
        System.out.println(res2 + " this is sum" + "res2");
        System.out.println(res3 + " this is sum" + "res3");
        System.out.println(res4 + " this is sum" + "res4");
        System.out.println(res5 + " this is sum" + "res5");*/
