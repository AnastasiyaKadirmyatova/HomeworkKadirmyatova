package homework5.homework5_2;

public class Circle extends Figures {

    public int r;

    public Circle(int r) {
        this.r = r;
    }

    public double perimeter() {
        return Math.PI * 2 * r;
    }

    public double area() {
        return Math.PI * r * r;
    }
}
