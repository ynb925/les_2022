package com.ynb.zarTaskWhile;

import java.util.Scanner;

/**
 * Задание 15.35 УУУУХХХХПОДГОРИТ))))
 * Напишите класс, который принимает с клавиатуры целое положительное число
 * и строит из него число с обратным порядком цифр. Новое значение следует вывести на экран
 */

/**
 * 1!=1
 * 2!=2
 * 3!=6
 * 4!=24
 * 5!=120
 * 6!=720
 * 7!=5040
 * fact(m) = n * n-1 * n-2 * n-3....
 * fact(5) = 1 * 2 * 3 * 4 * 5
 * 001         3    2
 * int res = fact * i; = 6
 */

public class Zar_task_15_37_w {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" count of enter nums: ");
        int numFactor = scanner.nextInt();
        int count = numFactor - 1;

        while (count > 0) {
            numFactor = numFactor * (count);
            count--;
        }
        System.out.println(numFactor);
    }
}

