package com.ynb.zarArrays;


import static com.ynb.zarArrays.CreateArray.*;


/**
 * Задание 19.20 Напишите метод, который получает в качестве параметра
 * массив и проверяет есть ли там повторяющиеся элемент ВЩЩБЩЕ.
 * Если есть - возвращает TRUE
 * <p>
 * <p>
 * 1 2 3 6 8 4 6 1 515 893
 */
public class Arr19_20 {
    public static void main(String[] args) {
        //  int[] arrSize = createArr(10, 30);

        int[] arrSize = {1, 2, 3, 4, 5, 6, 2, 8, 9, 11};

        printArr(arrSize);
        System.out.println(equalNumArr(arrSize));
    }

    public static boolean equalNumArr(int[] array) {

        for (int i = 0; i < array.length; i++) {    //  0
            for (int j = i + 1; j > array.length; j++) {  // 1
                if (array[i] == array[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}






/*

//  why not work double for loop ?????????
        for (int i = 0, j = i + 1; i < array.length; i++, j++) {
            if (array[j] == array[i]) {
                return true;
            }
        }
        return false;
    }
}*/
