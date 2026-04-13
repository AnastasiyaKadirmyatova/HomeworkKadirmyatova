package homework4.homework4_1;

public class CreditCard {
    /*
    Задача 1:
    Создать класс CreditCard c полями номер счета, текущая сумма на счету.
    Добавьте метод, который позволяет начислять сумму на кредитную карточку.
    Добавьте метод, который позволяет снимать с карточки некоторую сумму.
    Добавьте метод, который выводит текущую информацию о карточке. Напишите
    программу, которая создает три объекта класса CreditCard у которых заданы
    номер счета и начальная сумма.
    Тестовый сценарий для проверки: Положите деньги на первые две карточки и
    снимите с третьей. Выведите на экран текущее состояние всех трех карточек.
     */

    String accountNumber;
    int actualSum;

    public CreditCard(String accountNumber, int actualSum) {
        this.accountNumber = accountNumber;
        this.actualSum = actualSum;
    }

    public void chargeAmount(int sum) {
        actualSum += sum;
    }

    public void writeOffAmount(int sum) {
        actualSum -= sum;
    }

    public void printActualSum() {
        System.out.println("Текущая сумма на счету %s: %s".formatted(accountNumber, actualSum));
    }
}
