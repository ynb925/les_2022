package com.ynb.zarTaskMethod;


import java.util.Scanner;

/**
 * Задание 17.13 Напишите метод, который принимает в качестве параметра два целых числа и возвращает значение true,
 * если в числах одинаковое количество цифр; в ином случае метод возвращает значение false.
 */
public class Zar_method_17_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" wrt 1st num : ");
        int scan1st = scanner.nextInt();

        System.out.println(" wrt 2nd num : ");
        int scan2nd = scanner.nextInt();

        System.out.println(getTrue(scan1st, scan2nd));
    }

    public static int checkNums(int numbers) {
      /*  int counter = 0;
       for (int div = 1; numbers / div != 0; counter++, div *= 10) { }
        return counter;*/
        int div = 1;
        int counter = 0;

        while (numbers / div != 0) {
            div = div * 10;
            counter++;
        }
        return counter;
    }

    public static boolean getTrue(int value1, int value2) {

        int counter1 = checkNums(value1);
        int counter2 = checkNums(value2);

        return counter1 == counter2;
    }
}


  /*if (counter1 != counter2) {
            return false;
        }else {
            return true;
        }*/
