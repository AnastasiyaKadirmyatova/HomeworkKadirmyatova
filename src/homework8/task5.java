package homework8;

import java.util.Scanner;

public class task5 {
    /*
    Задача 5:
Вывести на консоль новую строку, которой задублирована каждая буква из
начальной строки. Например, "Hello" -> "HHeelllloo"
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        StringBuilder newString = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            newString.append(string.charAt(i)).append(string.charAt(i));
        }

        System.out.println(String.format("Новая строка: %s", newString));
    }
}
