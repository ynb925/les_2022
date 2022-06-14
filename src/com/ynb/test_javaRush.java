package com.ynb;

import java.util.Scanner;

public class test_javaRush {
    public static void main(String[] args) {
        int a = 5;
        System.out.println(a / 2);

    }
}


/*    public static void main(String[] args) {
        printHydrogenInfo();
        printJavaInfo();

    }

    //напишите тут ваш код

    public static void printHydrogenInfo() {
        System.out.println("Водород:");
        System.out.println("Это химический элемент периодической системы с обозначением H и атомным номером 1.");
        System.out.println("Является самым легким элементом таблицы.");
        System.out.println("Водород применяется в:");
        System.out.println("-Химической промышленности;");
        System.out.println("-Нефтеперерабатывающей промышленности;");
        System.out.println("-Авиации;");
        System.out.println("-Электроэнергетике.");
    }

    public static void printJavaInfo() {
        System.out.println("Остров Ява:");
        System.out.println("Входит в состав Индонезии.");
        System.out.println("На острове зародились государства Матарам, Маджапахит, Демак.");
        System.out.println("Ява является самым населенным островом в мире:");
        System.out.println("Общее население — 140 млн. человек.");
        System.out.println("Плотность населения — 1061 чел/км.кв.");
        System.out.println("Здесь производят один из знаменитых сортов кофе — Копи Лювак.");
    }

}*/

/*    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" wrt length of array ");
        int num = scanner.nextInt();
        int[] num2 = new int[5];

        System.out.println(" in nums for array ");
        for (int i = 0; i < num; i++) {

            System.out.println(num2[i]);
        }
    }
}*/

  /*
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] ints = new int[n];
        for (int i = 0; i < n; i++) {
            ints[i] = scanner.nextInt();
        }

        if (n % 2 == 0) {
            for (int i = ints.length - 1; i >= 0; i--) {
                System.out.println(ints[i]);
            }
        } else {
            for (int i = 0; i < ints.length; i++) {
                System.out.println(ints[i]);
            }
        }
    }
}*/
/*        double glass = 0.5;
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        boolean opti = scanner.nextBoolean();
        int res;
        if (opti) {
            res = (int) Math.ceil(glass);
        } else {
            res = (int) Math.floor(glass);
        }
        System.out.println(res);
    }
}*/

 /*       //напишите тут ваш код

        Scanner scanner = new Scanner(System.in);
        double speedMetr = scanner.nextInt();
        int speedKilo = (int) Math.round(speedMetr * 3.6);
        System.out.println(speedKilo);
    }
}
*/
        /*//напишите тут ваш код

        Scanner scanner = new Scanner(System.in);

        int fNum = scanner.nextInt();
        int sNum = scanner.nextInt();

        double res = fNum * 1. / sNum;
        System.out.println(res);
    }
}*/



/*
 *//* Ввести с клавиатуры положительное целое число radius. Это будет радиус окружности.
        Вывести на экран площадь круга, рассчитанную по формуле: S = pi * radius * radius.*//*

        Scanner scanner = new Scanner(System.in);
        int rad = scanner.nextInt();

        double pi = 3.14;
        int res = (int) (pi * rad * rad);

        System.out.println(res);
    }
}*/

    /*    Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int num = scanner.nextInt();

        do {
            System.out.println(string);
            num--;
        } while (num > 0 && num < 4);
    }
}*/


/*        //напишите тут ваш код
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print('8');
            }
            System.out.println();
        }
    }
}*/

/*        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int multiple = scanner.nextInt();

        int sum = 0;
        //напишите тут ваш код
        for (int i = start; i < end; i++) {
            if (i % multiple != 0) {
                continue;
            }
            sum = sum + i;
        }
        System.out.println(sum);
    }
}*/



/*      *//* Напиши программу, в которой с помощью цикла for на экран будут выведены чётные числа от 1 до 15.
        Каждое значение нужно выводить с новой строки.*//*

        int min = 1;
        int max = 15;

        int i = 0;
        for (i = min + 1; i < max; i = i + 2) {

            System.out.println(i);
        }
    }
}*/



/*        //напишите тут ваш код
        Scanner console = new Scanner(System.in);
        int x;
        int fRes = Integer.MIN_VALUE;

        while (console.hasNextInt()) {
            x = console.nextInt();

            if (x % 2 == 0 && x > fRes) {
                fRes = x;
            }
        }
        System.out.println(fRes);
    }
}*/


    /*    Scanner console = new Scanner(System.in);

        int x;
        int min = Integer.MAX_VALUE;

        while (console.hasNextInt()) {
            x = console.nextInt();

            if (min > x) {
                min = x;
            }
        }
        System.out.println(min);
    }
}*/






  /*      int sum = 0;
        int i = 0;
        while (i <= 100) {
            if ((i % 3) == 0) {
                i++;
                continue;
            }
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }
}*/

/*        Scanner = new Scanner(System.in);

        while (true) {
            String s = scanner.nextLine();

            if (s.equals("enough")) {
                break;
            }
            System.out.println(s);
        }
    }
}*/




  /*      //напишите тут ваш код
        int a = 0;
        while (a < 10) {
            a++;
            int b = 0;
            System.out.print("Б");
            while (b < 19) {
                if (a > 1 && a < 10 && b < 18) {
                    System.out.print(" ");
                    b++;
                } else {
                    System.out.print("Б");
                    b++;
                }
            }
            System.out.println();
        }
    }
}*/

  /*  public static void main(String[] args) {
        int a = 0;
        while (a < 5) {
            a++;
            int b = 0;
            while (b < 10) {
                System.out.print("Q");
                b++;
            }
            System.out.println();
        }
    }
}*/




   /* public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        boolean isEnter = false;

        while (!isEnter) {
            int a = scanner.nextInt();
            sum = sum + a;

            if (scanner.hasNextLine()) {
                isEnter = scanner.hasNext("ENTER");
            }
        }
        System.out.println(sum);
    }
}*/


