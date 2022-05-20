package com.ynb.zarTaskMethod;


import java.util.Scanner;

/**
 * Задание 17.34 Напишите метод, который принимает в качестве параметра положительное целое число
 * и возвращает число с противоположным порядком цифр. Например,
 * для параметра 123 метод возвратит 321, для параметра 120 метод вернет 21.
 */


public class Zar_method_17_34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("wrt num to 'mirror': ");
        int scanNum = scanner.nextInt();

        System.out.print(makeMirror(scanNum));
    }

    public static int makeMirror(int mirror) {
        int bufferNum = 0;
        int makeNum = 0;
        int div = 1;

        while (mirror / div != 0) {
            bufferNum = (mirror / div) % 10;
            makeNum = makeNum * 10 + bufferNum;
            div = div * 10;
        }
        return makeNum;
    }
}