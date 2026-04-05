package homework8;

import java.util.Scanner;

public class task4 {
    /*
    Задача 4:
Ввести 3 строки с консоли. Найти слово, состоящее только из различных
символов. Если таких слов несколько, найти первое из них.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstString = scanner.nextLine();
        String secondString = scanner.nextLine();
        String thirdString = scanner.nextLine();

        String result = findFirstWordWithUniqueChars(firstString, secondString, thirdString);
        System.out.println(result);
    }

    // Проверяет, состоит ли строка только из уникальных символов
    private static boolean hasAllUniqueChars(String word) {
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static String findFirstWordWithUniqueChars(String s1, String s2, String s3) {
        for (String line : new String[]{s1, s2, s3}) {
            String[] words = line.split("\\s+");
            for (String word : words) {
                if (!word.isEmpty() && hasAllUniqueChars(word)) {
                    return word;
                }
            }
        }
        return "Слово, состоящее только из различных символов, не найдено!";
    }
}
