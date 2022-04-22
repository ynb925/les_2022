package com.ynb.zarTasks;

import java.util.Scanner;

/**
 * Задание 3.9 Компания по продаже минеральной воды проводит конкурс «Балл под крышкой»: на внутренней стороне пробок,
 * которыми закрыты бутыл ки, выпускаемые компанией, напечатаны призовые баллы. Есть пробки, «равные» 10 баллам,
 * есть -100, есть -1000. Напишите класс, который принимает с клавиатуры три числа,
 * озна чающие количество пробок каждого типа,собранных Васей, и выводит на экран общее количество баллов, которые Вася получил.
 */

public class Zar_task_3_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму ");
        double value = scanner.nextDouble();
        System.out.print("Введите  кооф ");
        double value2 = scanner.nextDouble();

        System.out.print(value * value2);

          scanner.close();
     }
}
