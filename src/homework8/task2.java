package homework8;

import java.util.Scanner;

public class task2 {
    /*
    Ввести 3 строки с консоли. Упорядочить и вывести строки в порядке
    возрастания значений их длины.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstString = scanner.nextLine();
        String secondString = scanner.nextLine();
        String thirdString = scanner.nextLine();

        if (firstString.length() >= secondString.length()) {
            if (secondString.length() >= thirdString.length()) {
                System.out.println(String.format("%s\n%s\n%s", firstString, secondString, thirdString));
            } else {
                System.out.println(String.format("%s\n%s\n%s", firstString, thirdString, secondString));
            }
        } else if (secondString.length() >= thirdString.length()) {
            if (firstString.length() >= thirdString.length()) {
                System.out.println(String.format("%s\n%s\n%s", secondString, firstString, thirdString));
            } else {
                System.out.println(String.format("%s\n%s\n%s", secondString, thirdString, firstString));
            }
        } else {
            if (firstString.length() >= secondString.length()) {
                System.out.println(String.format("%s\n%s\n%s", thirdString, firstString, secondString));
            } else {
                System.out.println(String.format("%s\n%s\n%s", thirdString, secondString, firstString));
            }
        }
    }
}
