package com.ynb.zarTasks;

import java.util.Scanner;

/**
 * Задание 9.15 Напишите класс, который принимает с клавиатуры целое число, которое должно означать порядковый номер месяца.
 * В случае если полученное значение действительно соответствует порядковому номеру одного из месяцев,
 * следует вывести сезон (лето, осень, зима, весна), к которому относится месяц. В случае если введенное значение
 * не является порядковым номером месяца, следует вывести на экран соответствующее текстовое сообщение.
 */

public class Zar_task_9_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите оценку : ");
        int n = scanner.nextInt();

        //  зима: 12 ,1,2  || весна : 3, 4, 5 || лето: 6,7,8 || осень: 9,10,11

        if (n == 12 || n == 1 || n == 2) {
            System.out.println(" зима ");
        } else if (n >= 3 && n <= 5) {
            System.out.println(" весна ");
        } else if (n >= 6 && n <= 8) {
            System.out.println(" лето ");
        } else if (n >= 9 && n <= 11) {
            System.out.println(" осень ");
        } else {
            System.out.println(" не правильно введен сезон");
        }
    }
}