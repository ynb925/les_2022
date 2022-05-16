package com.ynb.lesons_0;

import java.util.Scanner;

public class test_pices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter num :  ");
        int n = scanner.nextInt();

        int res1 = (n % 10);
        int res2 = (n / 10)  ;
        int res3 = (n / 100) % 10;
        int res4 = (n / 1000) % 10;
        int res5 = (n / 10000) % 10;

        System.out.println(res1 + " this is sum" + "res1");
        System.out.println(res2 + " this is sum" + "res2");
        System.out.println(res3 + " this is sum" + "res3");
        System.out.println(res4 + " this is sum" + "res4");
        System.out.println(res5 + " this is sum" + "res5");


    }
}
