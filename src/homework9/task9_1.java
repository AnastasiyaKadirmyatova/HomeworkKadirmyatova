package homework9;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class task9_1 {
    /*
    Задача 1:
Пользователь вводит набор чисел в виде одной строки с клавиатуры.
Например: "1, 2, 3, 4, 4, 5". Избавиться от повторяющихся элементов в строке.
Вывести результат на экран.
При решении использовать коллекции.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите набор чисел через запятую: \n");
        String numbers = scanner.nextLine().trim();

        String[] numberArray = numbers.split(",\\s*");
        Set<String> uniqueNumbers = new HashSet<>(Arrays.asList(numberArray));

        System.out.println(uniqueNumbers);
    }
}
