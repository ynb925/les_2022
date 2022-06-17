package com.ynb.zarArrays;

import java.util.Random;
import java.util.Scanner;

/**
 * сделать циклическое тестирование программы
 */
public class uniTest {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            test();
        }
    }

    public static void test() {

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

