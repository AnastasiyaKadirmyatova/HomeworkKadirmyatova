package homework1;

public class Homework1_2 {

    public static void main(String[] args) {

//        В переменной n хранится двузначное число. Создайте программу,
//        вычисляющую и выводящую на экран сумму цифр n. Например: n = 26, в
//        результате мы должны получить 8 (2 + 6).

        int n = 37;
        int sum;

        sum = n / 10 + n % 10;

        System.out.println("Сумма цифр числа n равна: "  + sum);
    }
}
