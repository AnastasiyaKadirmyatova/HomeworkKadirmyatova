package homework7;

public class Homework7 {
    public static void main(String[] args) {

        ExceptionExamples exceptionExamples = new ExceptionExamples();

        System.out.println("Метод с использованием try - catch");
        exceptionExamples.onlyCatch();

        System.out.println("\nМетод с использованием try - catch - catch");
        exceptionExamples.multipleCatch();

        System.out.println("\nМетод с использованием multi catch");
        exceptionExamples.multiCatch();

        System.out.println("\nМетод с использованием try - catch - finally");
        exceptionExamples.tryCatchFinally();
    }
}
