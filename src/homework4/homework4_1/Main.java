package homework4.homework4_1;

public class Main {

    public static void main(String[] args) {
        CreditCard creditCard1 = new CreditCard("40817810000001234567", 10000);
        CreditCard creditCard2 = new CreditCard("40817810000009876543", 200000);
        CreditCard creditCard3 = new CreditCard("40818881000000112334", 16800);

        creditCard1.chargeAmount(20000);
        creditCard2.chargeAmount(20000);
        creditCard3.writeOffAmount(16000);

        creditCard1.printActualSum();
        creditCard2.printActualSum();
        creditCard3.printActualSum();
    }
}
