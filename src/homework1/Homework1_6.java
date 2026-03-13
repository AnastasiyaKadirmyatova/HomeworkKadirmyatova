package homework1;

public class Homework1_6 {

    public static void main(String[] args) {

        //       Написать программу которая будет менять местами значение целочисленных
        //переменных.

        int a = 7;
        int b = 9;

        int sum = a + b;
        b = a;
        a = sum - b;

        System.out.println("Новые значения a = %s, b = %s".formatted(a, b));
    }
}
