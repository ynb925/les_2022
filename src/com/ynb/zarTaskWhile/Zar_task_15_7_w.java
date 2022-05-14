package com.ynb.zarTaskWhile;

import java.util.Scanner;

/**
 * Задание 15.7 Напишите класс, который должен принять с клавиатуры значение 123 и вывести на экран
 * сообщение Код принят. Класс будет снова и снова принимать с клавиатуры значения до тех пор, пока
 * не будет введено значение 123. На каждое вводимое с клавиатуры значение, отличное от 123, класс
 * должен выводить сообщение Код неверный, повторите ввод.
 */

public class Zar_task_15_7_w {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter Num: ");
        int scanNum;

        while (true) {
            scanNum = scanner.nextInt();
            if (scanNum == 123) {
                System.out.println(" code is enter ");
            } else {
                System.out.println(" code is wrong ");
            }
        }
    }
}
