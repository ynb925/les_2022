package com.ynb.zarTasks;

import java.util.Scanner;

/**
 * Задача 1.2  В текущей задаче необходимо, чтобы пользователь задавал наименование месяца, а программа выдавала номер месяца.
 * Выводимый на экран текст должен быть примерно таким: "Номер месяца наименование месяца - номер месяца".
 * <p>
 * Если наименование месяца введено не верно, должно быть выведено на экран соответствующее сообщение.
 */

public class Zar_task_1_2_sw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" write the month :  ");
        int n = scanner.nextInt();
        String strVal = switch (n) {
            case 1 -> n + "january";
            case 2 -> n + "February";
            case 3 -> n + "March";
            case 4 -> n + "april";
            case 5 -> n + "May";
            case 6 -> n + "june";
            case 7 -> n + "july";
            case 8 -> n + "August";
            case 9 -> n + "september";
            case 10 -> n + "october";
            case 11 -> n + "November";
            case 12 -> n + "December";

            default -> ("not correct value: " + n);
        };
        System.out.println(strVal);
    }
}



