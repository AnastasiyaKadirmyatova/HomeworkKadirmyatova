package homework2;

import java.util.Scanner;

public class Homework2_2 {
    public static void main(String[] args) {
        /*
        Для введенного числа t (температура на улице) вывести: Если t>–5, то вывести «Warm».
        Если –5>= t >–20, то вывести «Normal». Если –20>= t, то вывести «Cold».
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько градусов на улице?");

        int temperature = scanner.nextInt();

        if (temperature > -5) {
            System.out.println("\nWarm");
        } if (temperature <= -20) {
            System.out.println("\nCold");
        } else {
            System.out.println("\nNormal");
        }
    }
}
