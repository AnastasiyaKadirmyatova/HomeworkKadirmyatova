package homework8;

import java.util.Scanner;

public class task3 {
    /*
    Ввести 3 строки с консоли. Вывести на консоль те строки, длина которых
меньше средней, а также их длину
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstString = scanner.nextLine();
        String secondString = scanner.nextLine();
        String thirdString = scanner.nextLine();

        float avg = (firstString.length() + secondString.length() + thirdString.length()) / 3;
        System.out.println(String.format("Средняя длина строки: %s\n", avg));
        if (firstString.length() < avg) {
            System.out.println(firstString);
            System.out.println(String.format("Длина строки: %s\n", firstString.length()));
        }
        if (secondString.length() < avg) {
            System.out.println(secondString);
            System.out.println(String.format("Длина строки: %s\n", secondString.length()));
        }
        if (thirdString.length() < avg) {
            System.out.println(thirdString);
            System.out.println(String.format("Длина строки: %s\n", thirdString.length()));
        }
    }
}
