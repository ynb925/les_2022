package com.ynb.lesons_3;

/**
 * Задача 1.1.5 (Тема 5).
 * Объявите 10 переменных типа int со значениями 0,1, 2, 3, 4, 5, 6, 7, 8, 9.
 *         Объявите ещё одну переменную int и сохраните в неё сумму этих переменных, деленную на 10.
 *         Получается, у вас будет среднее арифметическое этих чисел в одной переменной.
 *         Распечатайте её через println. Сколько программа отбросила в дробной части? Сравните со значением double.
 */

public class LesExam_3 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 2;
        int d = 3;
        int f = 4;
        int e = 5;
        int h = 6;
        int j = 7;
        int l = 8;
        int m = 9;
        //
        int z = ((a + b + c + d + f + e + h + j + l + m) / 10);
        System.out.println(z);
        System.out.println((double) z);

    }
}

