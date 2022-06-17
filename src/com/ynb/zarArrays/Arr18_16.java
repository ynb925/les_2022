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
