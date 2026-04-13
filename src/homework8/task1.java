package homework8;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String firstString = scanner.nextLine();
        String secondString = scanner.nextLine();
        String thirdString = scanner.nextLine();


        if (firstString.length() > secondString.length()) {
            if (firstString.length() > thirdString.length()) {
                System.out.println(String.format("Самая длинная строка: \"%s\", количество ее символов: %s",
                        firstString, firstString.length()));
            } else if (firstString.length() < thirdString.length()) {
                System.out.println(String.format("Самая длинная строка: \"%s\", количество ее символов: %s",
                        thirdString, thirdString.length()));
            } else {
                System.out.println(String.format("Строки одинаковой максимальной длины:\n\"%s\"\n\"%s\"\nКоличество символов: %s",
                        firstString, thirdString, thirdString.length()));
            }
        }
        else if (firstString.length() < secondString.length()) {
            if (secondString.length() > thirdString.length()) {
                System.out.println(String.format("Самая длинная строка: \"%s\", количество ее символов: %s",
                        secondString, secondString.length()));
            } else if (secondString.length() < thirdString.length()) {
                System.out.println(String.format("Самая длинная строка: \"%s\", количество ее символов: %s",
                        thirdString, thirdString.length()));
            } else
                System.out.println(String.format("Строки одинаковой максимальной длины:\n\"%s\"\n\"%s\"\nКоличество символов: %s",
                        secondString, thirdString, thirdString.length()));
        } else {
            if (secondString.length() > thirdString.length()) {
                System.out.println(String.format("Строки одинаковой максимальной длины:\n\"%s\"\n\"%s\"\nКоличество символов: %s",
                        secondString, firstString, firstString.length()));
            } else {
                System.out.println(String.format("Строки одинаковой максимальной длины:\n\"%s\"\n\"%s\"\n\"%s\"\nКоличество символов: %s",
                        secondString, firstString, thirdString, firstString.length()));
            }
        }


        if (firstString.length() < secondString.length())
            if (firstString.length() < thirdString.length()) {
                System.out.println(String.format("Самая короткая строка: \"%s\", количество ее символов: %s",
                        firstString, firstString.length()));
            } else if (firstString.length() > thirdString.length()) {
                System.out.println(String.format("Самая короткая строка: \"%s\", количество ее символов: %s",
                        thirdString, thirdString.length()));
            } else {
                System.out.println(String.format("Строки одинаково короткой длины:\n\"%s\"\n\"%s\"\nКоличество символов: %s",
                        firstString, thirdString, thirdString.length()));
            }
        else if (firstString.length() > secondString.length()) {
            if (secondString.length() < thirdString.length()) {
                System.out.println(String.format("Самая короткая строка: \"%s\", количество ее символов: %s",
                        secondString, secondString.length()));
            } else if (secondString.length() > thirdString.length()) {
                System.out.println(String.format("Самая короткая строка: \"%s\", количество ее символов: %s",
                        thirdString, thirdString.length()));
            } else
                System.out.println(String.format("Строки одинаково короткой длины:\n\"%s\"\n\"%s\"\nКоличество символов: %s",
                        secondString, thirdString, thirdString.length()));
        } else {
            if (secondString.length() < thirdString.length()) {
                System.out.println(String.format("Строки одинаково короткой длины:\n\"%s\"\n\"%s\"\nКоличество символов: %s",
                        secondString, firstString, firstString.length()));
            } else {
                System.out.println(String.format("Строки одинаково короткой длины:\n\"%s\"\n\"%s\"\n\"%s\"\nКоличество символов: %s",
                        secondString, firstString, thirdString, firstString.length()));
            }
        }

    }
}
