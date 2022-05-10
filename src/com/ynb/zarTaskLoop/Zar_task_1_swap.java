package com.ynb.zarTaskLoop;

import java.util.Scanner;

/**
 * введите 2 числа, и поменяйте их местами.
 */

public class Zar_task_1_swap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" test num: ");

        int num1 = scanner.nextInt(); // 4
        int num2 = scanner.nextInt(); // 10
        int temp = 0;


        temp = num1; // 0 => 4
        num1 = num2; // 4 => 10
        num2 = temp; // 10 => 4

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}
