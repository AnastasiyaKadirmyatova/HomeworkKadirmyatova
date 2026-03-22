package homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework3_2 {
    public static void main(String[] args) {
        /*
        Найти минимальный - максимальный элементы и вывести в консоль.
         */

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] numbers = new int[size];

        System.out.println("Введите размер массива:");

        for (int i = 0; i < size; i ++) {
            numbers[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(numbers));

        /*
        Способ 1:
        int minNumber = numbers[0];
        int maxNumber = numbers[0];

        for (int i = 1; i < size; i ++) {
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
            if (numbers[i] < minNumber) {
                minNumber = numbers[i];
            }
        }
        */

        Arrays.sort(numbers);
        int maxNumber = numbers[size - 1];
        int minNumber = numbers[0];

        System.out.println("Максимальное число массива: " + maxNumber);
        System.out.println("Минимальное число массива: " + minNumber);
    }
}
