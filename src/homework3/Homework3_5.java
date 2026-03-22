package homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework3_5 {
    public static void main(String[] args) {
        /*
        Пройти по массиву и поменять местами элементы первый и последний, второй
        и предпоследний и т.д.
         */

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] numbers = new int[size];
        int left = 0;
        int right = size - 1;

        System.out.println("Введите размер массива:");

        for (int i = 0; i < size; i ++) {
            numbers[i] = random.nextInt(10);
        }
        System.out.println("Исходный массив: " + Arrays.toString(numbers));

        while (left < right) {
            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;

            left++;
            right--;
        }
        System.out.println("Обратный массив: " + Arrays.toString(numbers));
    }
}
