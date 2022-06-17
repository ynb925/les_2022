package com.ynb.zarArrays;

import java.util.Random;
import java.util.Scanner;

/**
 * Задание 18.16 Напишите класс, который заполняет случайными двузначными числами массив,
 * размер которого при инициализации вводится с клавиатуры.  После заполнения класс должен
 * вывести на экран значения массива следующим образом:
 * • в первой строке -четные значения, содержащиеся в массиве;
 * • во второй строке -нечетные значения, содержащиеся в массиве.
 */

public class Arr18_16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println(" wrk cycle count: ");
        int[] arrSize = new int[scanner.nextInt()];

        System.out.println(" print all arr nums ");
        for (int i = 0; i < arrSize.length; i++) {
            arrSize[i] = random.nextInt(10, 100);
            System.out.println("index: " + i + "| " + arrSize[i]);
        }
        System.out.println();
        System.out.println(" print res: even nums ");
        for (int e = 0; e < arrSize.length; e++) {
            if (arrSize[e] % 2 == 0) {
                System.out.println("even" + "index: " + e + "| " + arrSize[e]);
            }
        }
        System.out.println();
        System.out.println(" print res: odd nums  ");
        for (int o = 0; o < arrSize.length; o++) {
            if (arrSize[o] % 2 != 0) {
                System.out.println("odd" + "index: " + o + "| " + arrSize[o]);
            }
        }
    }
}



/*
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

        System.out.println(" wrk cycle count: ");
                int countNum = scanner.nextInt();
                int beforeNum = 0;

                for (int i = 0; i < countNum; i++) {

        System.out.println(" wrt num: ");
        int enterNum = scanner.nextInt();

        System.out.println("eNum | " + enterNum + "    " + "befNum | " + beforeNum + " _________ | count |" + i);
        beforeNum = enterNum;
        }
        }
        }
*/
