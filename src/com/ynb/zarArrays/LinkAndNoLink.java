package com.ynb.zarArrays;

public class LinkAndNoLink {
    public static void main(String[] args) {
        // linc type - все остальные
        // no link type - itn, long, boolean...
        int a = 42;
        int[] arr = {1, 2, 3, 4, 5};

        someMethod(arr, a);

        System.out.println("a = " + a);

        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static void someMethod(int[] brr, int b  ) {
        b++;
        System.out.println("b = " + b );
        brr[0] = 9999;
    }
}
