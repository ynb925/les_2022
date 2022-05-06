package com.ynb.lesons_0;

import java.util.Scanner;

public class test_pices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter your age :  ");
        int n = scanner.nextInt();

        int a = n % 10;
        int b = n % 100;
        int c = n % 1000;
        int d = n / 10;
        int f = n / 100;
        System.out.println(a + " " + n);
        System.out.println(b + " " + n);
        System.out.println(c + " " + n);
        System.out.println(d + " " + n);
        System.out.println(f + " " + n);


    }

}
