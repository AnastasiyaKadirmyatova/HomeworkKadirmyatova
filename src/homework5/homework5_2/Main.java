package homework5.homework5_2;

public class Main {

    public static void main(String[] args) {
        Figures figures[] = {
                new Triangle(3, 4, 5),
                new Rectangle(3, 5),
                new Circle(2)
        };

        double sumPerimeters = figures[0].perimeter() + figures[1].perimeter() + figures[2].perimeter();
        System.out.println("Сумма периметров трех фигур: " + sumPerimeters);
    }
}
