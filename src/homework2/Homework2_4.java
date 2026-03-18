package homework2;

public class Homework2_4 {
    public static void main(String[] args) {
        /*
        Необходимо, чтоб программа выводила на экран вот такую последовательность:
        7 14 21 28 35 42 49 56 63 70 77 84 91 98. В решении используйте цикл while.
         */

        int n = 7;
        while (n <= 98) {
            System.out.println(n);
            n += 7;
        }
    }
}
