package homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework3_1 {
    public static void main(String[] args) {
        /*
        Для всех задач исходные условия следующие: пользователь с клавиатуры
        вводит размер массива (просто целое число). После того, как размер массива
        задан, заполнить его одним из двух способов: используя Math.random(), или
        каждый элемент массива вводится пользователем вручную. Попробовать оба
        варианта. После заполнения массива данными, решить для него следующие
        задачи:
        Задача 1:
        Пройти по массиву, вывести все элементы в прямом и в обратном порядке.
         */

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] numbers = new int[size];
        int [] reverseNumbers = new int[size];

        System.out.println("Введите размер массива:");

        for (int i = 0; i < size; i ++) {
            numbers[i] = random.nextInt(100);
            reverseNumbers[size - i - 1] = numbers [i];
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(reverseNumbers));
    }
}
