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
        System.out.println("Введите число: ");

        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i ++) {
            sum += i;
        }
        System.out.println("\nСумма от 1 до числа %s: %s".formatted(n, sum));
    }
}
