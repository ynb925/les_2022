package com.ynb.lesons_0;

import java.util.Scanner;


public class LesExam_0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int scan;
        do {
            scan = scanner.nextInt();
            if (scan != 123) {
                System.out.println("cod not correct. try again");
            } else {
                System.out.println("cod accepted ");
            }
        } while (true);
    }
}