package homework2;

import java.util.Scanner;

public class Homework2_1 {
    public static void main(String[] args) {
        /*
        Напишите программу, которая будет принимать на вход число из консоли и на
        выход будет выводить сообщение четное число или нет. Для определения
        четности числа используйте операцию получения остатка от деления (операция
        выглядит так: '% 2').
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");

        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("\nЧисло %s - четное".formatted(number));
        } else {
            System.out.println("\nЧисло %s - нечетное".formatted(number));
        }
    }
}
