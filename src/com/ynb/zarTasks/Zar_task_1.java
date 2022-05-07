package com.ynb.zarTasks;

import java.util.Scanner;

/**
 * Задача1. Напиши программу которая высчитывает положительные числа Фибоначчи
 * (не сложно, погугли что такое числа Фибоначчи). Используй любой удобный цыкл.
 * Например я указываю 6е число Фибоначчи, на экран должно вывести 8.
 * PS используй инт, мы не будем высчитывать 100е число Фибоначчи.
 * <p>
 * f0 = 0 + 0 = 0
 * f1= 0 + 1 = 1
 * f2= 0 + 1 = 1
 * f3= 1 + 1 = 2
 * f4= 1 + 2 = 3
 * f5= 2 + 3 = 5
 * f6= 3 + 5 = 8
 * f7= 5 + 8 = 13
 * f8= 8 + 13 = 21
 * f9= 13 + 21 = 34
 * f10= 21 + 34 = 55
 */
public class Zar_task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" enter  num : ");
        int n = scanner.nextInt();

        int f1 = 1;
        int f2 = 1;
        int f3 = 0;


        for (int i = 0; i <= n; i++) {
            f3 = f1 + f2;

            System.out.print(f3 + " ");

        }
    }
}

