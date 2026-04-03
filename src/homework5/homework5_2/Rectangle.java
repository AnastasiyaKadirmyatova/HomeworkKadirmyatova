package homework5.homework5_2;

public class Rectangle extends Figures {

    public int a, b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public double perimeter() {
        return 2 * (a + b);
    }

    public double area() {
        return a * b;
    }
}
