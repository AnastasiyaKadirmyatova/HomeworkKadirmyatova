package homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework3_4 {
    public static void main(String[] args) {
        /*
        Найти и вывести количество нулевых элементов. Если нулевых элементов нет -
        вывести сообщение, что их нет.
         */

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] numbers = new int[size];
        int countZero = 0;

        System.out.println("Введите размер массива:");

        for (int i = 0; i < size; i ++) {
            numbers[i] = random.nextInt(10);
        }

        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);

        for (int i = 0; i < size; i ++) {
            if (numbers[i] == 0) {
                countZero ++;
            } else {
                break;
            }
        }

        System.out.println("Количество нулевых элементов: " + countZero);
    }
}
