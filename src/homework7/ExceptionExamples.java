package homework7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExamples {

    public void onlyCatch() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Какую порцию кофе вы хотите?");
        try {
            int size = scanner.nextInt();
        } catch (InputMismatchException e){
            System.out.println("Ошибка. Вы ввели нечисловое значение!");
        }
    }

    public void multipleCatch() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите индекс массива (0-2):");

        int[] arr = {10, 20, 30};

        try {
            int index = scanner.nextInt();
            System.out.println("Значение: " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: Индекс вне границ массива.");
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: Вы ввели нечисловое значение.");
        }
    }

    public void multiCatch() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число (до 10 цифр):");

        try {
            int number = scanner.nextInt();
            if (number < 0) {
                throw new IllegalArgumentException("Число не может быть отрицательным.");
            }
            String text = "Длина: " + number;
            System.out.println(text.substring(10)); // Может вызвать StringIndexOutOfBoundsException
        } catch (InputMismatchException | StringIndexOutOfBoundsException | IllegalArgumentException e) {
            System.out.println("Произошла одна из ошибок ввода или обработки: " + e.getMessage());
        }
    }

    public void tryCatchFinally() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для парсинга:");

        try {
            String number = scanner.next();
            int value = Integer.parseInt(number); // Может вызвать NumberFormatException
            System.out.println("Число успешно преобразовано: " + value);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: Строка не является числом.");
        } finally {
            scanner.close();
            System.out.println("Блок finally выполнен. Этот код выполняется всегда.");
        }
    }
}
