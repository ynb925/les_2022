package com.ynb.zarTaskMethod;


import java.util.Scanner;

/**
 * Задание 17.38 Напишите метод, который получает в качестве параметров два значения -координаты (Х и У) точки А.
 * метод возвращает одно из значений 1, 2, 3 или 4 -в зависимости от того, в какой четверти системы координат находится точка.
 * В случае если точка находится на, как минимум, одной из осей координат, метод возвращает -1.
 */


public class Zar_method_17_38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("input X num: ");
        int scanX = scanner.nextInt();

        System.out.println("input Y num: ");
        int scanY = scanner.nextInt();

        System.out.println(getCoordinates(scanX, scanY));
    }

    public static int getCoordinates(int numX, int numY) {
        int x = numX;
        int y = numY;

        if (x == 0 || y == 0) {
            return -1;
        }
        if (x > 0 && y > 0) {
            return 1;
        }
        if (x < 0 && y > 0) {
            return 2;
        }
        if (x < 0 && y < 0) {
            return 3;
        } else {
            return 4;
        }
    }
}
