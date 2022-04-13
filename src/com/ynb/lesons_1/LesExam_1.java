package com.ynb.lesons_1;

/*Задача 1.1.2-а (тема 3). Запустите в main следующий код. Подумайте, почему деление даёт ноль,
 хотя это просто дробь меньше единицы. Замените у всех переменных тип int на double и посмотрите,
 что будет. Теперь дробь будет ненулевой и это правильно
 */
public class LesExam_1 {
    public static void main(String[] args) {
//        int a = 7;
// int b = 4;
// int z = 10;
        double a = 7;
        double b = 4;
        double z;
        z = a / b ;
        System.out.println(z);
    }
}
