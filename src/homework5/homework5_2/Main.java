package homework5.homework5_2;

public class Main {

    public static void main(String[] args) {
        Figures figures[] = {
                new Triangle(3, 4, 5),
                new Rectangle(3, 5),
                new Circle(2),
                new Circle(5),
                new Triangle(3, 3, 3)
        };
        double sumPerimeters = 0;

        for(Figures figure : figures) {
            sumPerimeters += figure.perimeter();
        }
        System.out.println("Сумма периметров пяти фигур: " + sumPerimeters);
    }
}
