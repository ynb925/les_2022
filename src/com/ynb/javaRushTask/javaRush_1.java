package com.ynb.javaRushTask;

/**
 * Любимое блюдо
 * Переименуй параметры метода printPersonInfo():
 * <p>
 * firstName в name;
 * lastName в surname;
 * favouriteDish в meal;
 * таким образом, чтобы функционал программы остался неизменным.
 * Имена переменных в методе main() оставь без изменений.
 * <p>
 * Requirements:
 * 1. Параметры метода printPersonInfo() должны называться name, surname и meal.
 * 2. Вывод в консоль должен соответствовать условию задачи.
 * 3. В методе main() переменные firstName, lastName, favouriteDish должны остаться без изменений.
 */
public class javaRush_1 {
    public static void main(String[] args) {
        String firstName = "Ольга";
        String lastName = "Киприяновна";
        String favouriteDish = "Пельмени";
        printPersonInfo(firstName, lastName, favouriteDish);
    }

    public static void printPersonInfo(String name, String surname, String meal) {
        System.out.println("Краткое досье:");
        System.out.println("Имя: " + name);
        System.out.println("Фамилия: " + surname);
        System.out.println("Любимое блюдо: " + meal);
    }

}