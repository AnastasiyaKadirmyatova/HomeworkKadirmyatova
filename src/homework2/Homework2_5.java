package homework2;

import java.util.Scanner;

public class Homework2_5 {
    public static void main(String[] args) {
        /*
        Напишите программу, где пользователь вводит любое целое положительное
        число.
        А программа суммирует все числа от 1 до введенного пользователем числа. Для
        ввода числа воспользуйтесь классом Scanner. Сделать проверку, чтобы
        пользователь не мог ввести некорректные данные
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число: ");

        if (!scanner.hasNextInt()) {
            System.out.println("Вы ввели не число!");
        } else {
            int n = scanner.nextInt();
            if (n < 0) {
                System.out.println("Число не положительное!");
            } else {
                int sum = 0;

                for (int i = 1; i <= n; i++) {
                    sum += i;
                }
                System.out.println("\nСумма от 1 до числа %s: %s".formatted(n, sum));
            }
        }
    }
}
