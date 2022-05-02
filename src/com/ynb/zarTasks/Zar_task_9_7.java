package com.ynb.zarTasks;

import java.util.Scanner;

/**
 * Задание 9.7 (отличная задача на все знание про if)
 * //
 * Напишите класс, который принимает с клавиатуры два числа, которые должны быть значениями двух нижних (у основания) углов в треугольнике.
 * Класс должен определять, о каком из следующих типов треугольников идет речь:  остроугольный, тупоугольный, прямоугольный, равнобедренный,
 * равно сторонний (возможно, что треугольник относится сразу к двум типам).  В случае если введенные с клавиатуры данные (или хотя бы одно из них)
 * не могут быть углами треугольника, следует вывести на экран сообщение Ошибочные данные.
 * //
 * PS. сума углов треугольника равна 180 градусов. тупоугольный если нижний угол больше 90 градусов, остроугольный - каждый нижний меньше 90 градусов,
 * равнобедренный если 2 угла равны, равносторонний если все углы равны.
 */

public class Zar_task_9_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 1й угол треугольника :  ");
        int n1 = scanner.nextInt();
        System.out.println("Введите 2й угол треугольника :  ");
        int n2 = scanner.nextInt();

        //  #1 остроугольный :
        //  1) разносторонний а<35 b<90 c<55 ; 2) равнобедренный а<45 b<90 c<45 ; 3) равносторонний а<60 b<60 c<60 ;

        //  #2 тупоугольные :
        //  1) разносторонний а<25 b<110 c<65 ; 2) равнобедренный а<15 b<110 c<55 ;

        //  #3 прямоугольные :
        //  1) разносторонний а<35 b<55 c<90 ; 2) равнобедренный а<45 b<45 c<90 ;

        if (n1 >= 35 && n2 <= 55 || n2 >= 35 && n1 <= 55) {    //  #1 остроугольный
            System.out.println(" 1 остроугольный  +  1) разносторонний ");
        } else if (n1 <= 45 && n2 <= 45) {
            System.out.println(" 1 остроугольный  +  2) равнобедренный ");
        } else if (n1 >= 60 && n2 >= 60) {
            System.out.println(" 1 остроугольный  + 3) равносторонний ");
        }
        if (n1 >= 25 && n2 <= 65) {    //  #2 тупоугольные
            System.out.println(" 2 тупоугольные  + 1) разносторонний ");
        } else if (n2 <= 55 && n1 >= 15) {
            System.out.println(" 2 тупоугольные  + 2) равнобедренный ");

        }
        if (n1 >= 35 && n2 <= 90) {    //  #3 прямоугольные
            System.out.println(" 3 прямоугольные  + 1) разносторонний ");
        } else if (n2 >= 45 && n1 <= 90) {
            System.out.println(" 3 прямоугольные  +  2) равнобедренный ");
        } else {
            System.out.println(" введите корректные углы ");
        }
    }
}