package com.ynb.zarTasks;

import java.util.Scanner;

/**
 * Задание 9.14 Определим «текстовую форму оценки» следующим образом: 1 или 2 -«неудовлетворительно», 3  -«удовлетворительно»,
 * 4  -«хорошо», 5  -«ОТЛИЧНО». Напишите класс, который принимает с клавиатуры целое число и, если оно соответствует оценке,
 * выводит на экран соответствующую «текстовую форму оценки». В случае если число не является оценкой, следует вывести на
 * экран соответствующее текстовое сообщение.
 */

public class Zar_task_9_14_sw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter num :  ");
        int n = scanner.nextInt();
        switch (n) {
            case 1, 2 -> System.out.println(" fk неудовлетворительно ");
            case 3 -> System.out.println(" can wrk удовлетворительно ");
            case 4 -> System.out.println(" not bad хорошо ");
            case 5 -> System.out.println(" best  ОТЛИЧНО ");
            default -> System.out.println(" enter num не правильно введенна оценка");
        }
    }
}
