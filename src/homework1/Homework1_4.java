package homework1;

public class Homework1_4 {

    public static void main(String[] args) {

//        В переменной n хранится вещественное число с ненулевой дробной частью.
//Создайте программу, которая округляет число n до ближайшего целого и
//выводящую результат на экран.

        double n = 5.89;

        int integerPart = (int)n;
        double fractionalPart = n % 1;

        if (fractionalPart >= 0.5) {
            integerPart += 1;
        }

        System.out.println("Ближайшее целое число к n: "  + integerPart);
    }
}
