package homework1;

public class Homework1_3 {

    public static void main(String[] args) {

//        В переменной n хранится трёхзначное число. Создайте программу,
//вычисляющую и выводящую на экран сумму цифр n. Например: n = 126, в
//результате мы должны получить 9 (1+2+6).

        int n = 126;
        int sum;

        sum = n / 100 + (n % 100) / 10 + n % 10;

        System.out.println("Сумма цифр числа n равна: "  + sum);
    }
}
