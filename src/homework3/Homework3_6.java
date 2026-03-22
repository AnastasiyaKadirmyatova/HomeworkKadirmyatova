package homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework3_6 {
    public static void main(String[] args) {
        /*
        Проверить, является ли массив возрастающей последовательностью (каждое
        следующее число больше предыдущего).
         */

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] numbers = new int[size];
        boolean isRise = true;

        System.out.println("Введите размер массива:");

        for (int i = 0; i < size; i ++) {
            numbers[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(numbers));

        for (int i = 1; i < size; i ++) {
            if (numbers[i] < numbers [i - 1]) {
                isRise = false;
                break;
            }
        }

        if (isRise) {
            System.out.println("Массив является возрастающей последовательностью");
        } else {
            System.out.println("Массив не является возрастающей последовательностью");
        }
    }
}
