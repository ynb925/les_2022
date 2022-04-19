package com.ynb.zarTasks;

import java.util.Scanner;

/**
 * Задание 3.4 Для пересчета суммы в одной валюте -в сумму в другой валюте
 * (на - пример, между суммой в гривнах и этой же суммой, но в евро) используется так называемый «банковский курс»:
 * числовой коэффициент, показывающий, чему равна единица одной валюты в единицах другой. Напишите класс,
 * который принимает с клавиатуры два числа: первое -сумму в одной валюте (например, в долларах),
 * и второе -«банковский курс». Класс должен подсчитать и вывести на экран сумму во второй валюте.
 */

public class Zar_task_3_4 {
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
