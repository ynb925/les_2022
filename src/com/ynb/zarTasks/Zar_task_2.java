package com.ynb.zarTasks;

/**
 * Задача 2. По аналогии с предыдущим напиши программу которая выводит факториал числа.
 * Например если задать факториал 5ти то должно вывести 120.
 * 1!=1
 * 2!=2
 * 3!=6
 * 4!=24
 * 5!=120
 * 6!=720
 * 7!=5040
 * fact(m) = n * n-1 * n-2 * n-3....
 */

public class Zar_task_2 {
    public static void main(String[] args) {
        int start = -5;
        int finish = 8;
        int res = 9%2;


        for (int i = start; i <= finish; i++) {
            //System.out.print(i);
            System.out.println(i);

        }


//        int fact = 5;
//        int result = 0;


//        for (int f = 0; fact > f; f--) {
//            result = fact * (fact - 1);
//        }
//        System.out.println(result);
/*
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }*/
    }
}



/*public class Zar_task_2 {
    public static void main(String[] args) {
        int factorial = factorial(5);
        System.out.println(factorial);
    }

    private static int factorial(int i) {
        if (i == 1) {
            return 1;
        }
        return i * factorial(i - 1);
    }
}*/


