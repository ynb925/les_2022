package com.ynb.zarTaskLoop;

import java.util.Scanner;

/**
 * Задание 12.10  Контрольная работа считается «провальной», если более половины учеников получили неудовлетворительные оценки.
 * Напишите класс, который принимает с клавиатуры число учеников в группе, а затем -оценку каждого ученика.
 * Класс должен определить, была ли контрольная «провальной».
 * ПС в класе может быть и 4-5 человек.
 */

public class Zar_task_12_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter num q-ty students: ");
        int numStudents = scanner.nextInt();

        double countQuality = 0;

        for (int i = 0; i < numStudents; i++) {
            System.out.println(i + 1 + " enter num Student Quality :  ");
            int numStudentQuality = scanner.nextInt();
            countQuality = countQuality + numStudentQuality;
        }
        if (countQuality / numStudents < 4)
            System.out.println("more half students is fail");
    }
}
