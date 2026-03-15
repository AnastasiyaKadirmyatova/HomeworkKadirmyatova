package homework1;

public class Homework1_5 {

    public static void main(String[] args) {

//        В переменных q и w хранятся два натуральных числа. Создайте программу,
//выводящую на экран результат деления q на w с остатком. Пример вывода
//программы (для случая, когда в q хранится 21, а в w хранится 8):
//21 / 8 = 2 и 5 в остатке.

      int q = 21;
      int w = 8;

      int quotient = q / w;
      int remainder = q % w;

      System.out.println("Результат деления: %s и %s в остатке".formatted(quotient, remainder));
    }
}
