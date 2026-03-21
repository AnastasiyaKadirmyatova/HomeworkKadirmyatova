package homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework3_3 {
    public static void main(String[] args) {
        /*
        Найти индексы минимального и максимального элементов и вывести в консоль.
         */

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] numbers = new int[size];
        int minNumber = numbers[0];
        int maxNumber = numbers[0];
        int posMaxNumber = 0;
        int posMinNumber = 0;

        System.out.println("Введите размер массива:");

        for (int i = 0; i < size; i ++) {
            numbers[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(numbers));

        for (int i = 1; i < size; i ++) {
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
                posMaxNumber = i;
            }
            if (numbers[i] < minNumber) {
                minNumber = numbers[i];
                posMinNumber = i;
            }
        }

        System.out.println("Индекс максимального числа массива: " + posMaxNumber);
        System.out.println("Индекс минимального числа массива: " + posMinNumber);
    }
}
