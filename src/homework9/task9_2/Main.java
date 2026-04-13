package homework9.task9_2;

public class Main {
    public static void main(String[] args) {
        Animals animals = new Animals();

        animals.addAnimal("monkey");
        animals.addAnimal("horse");
        animals.addAnimal("elephant");
        System.out.println(animals);

        animals.removeAnimal();
        System.out.println(animals);
    }
}
