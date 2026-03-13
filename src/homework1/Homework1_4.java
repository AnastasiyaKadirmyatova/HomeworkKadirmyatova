package homework1;

public class Homework1_4 {

    public static void main(String[] args) {

//        В переменной n хранится вещественное число с ненулевой дробной частью.
//Создайте программу, которая округляет число n до ближайшего целого и
//выводящую результат на экран.

        double n = 1.11;
        long intN;

        intN = Math.round(n);

        System.out.println("Ближайшее целое число к n: "  + intN);
    }
}
