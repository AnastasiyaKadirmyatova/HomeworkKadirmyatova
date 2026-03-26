package homework4.homework4_2;

public class Bankomat {

    /*
    Задача 2:
    Создать класс, описывающий банкомат. Набор купюр, находящихся в
    банкомате, должен задаваться тремя свойствами: количеством купюр
    номиналом 20, 50 и 100. Сделать метод для добавления денег в банкомат.
    Сделать функцию, снимающую деньги, которая принимает сумму денег, а
    возвращает булевое значение - успешность выполнения операции. При
    снятии денег, функция должна распечатывать каким количеством купюр
    какого номинала выдаётся сумма. Создать конструктор с тремя параметрами
    -количеством купюр каждого номинала
     */

    int countTwentyBills;
    int countFiftyBills;
    int countHundredBills;

    boolean isSuccess = true;
    int withdrawalHundredBills = 0;
    int withdrawalFiftyBills = 0;
    int withdrawalTwentyBills = 0;

    public Bankomat() {
    }

    public void determineSuccess() {
        if (isSuccess) {
            System.out.println("Операция выполнена!");
            System.out.println();
        } else {
            System.out.println("Операция не может быть выполнена!");
            System.out.println();
        }
    }

    public void deposit(int sum) {
        if (sum > 0) {
            countHundredBills += (sum / 100);
            if (sum % 100 > 0) {
                sum = sum % 100;
                countFiftyBills += (sum / 50);
                if (sum % 50 > 0) {
                    sum = sum % 50;
                    countTwentyBills += (sum / 20);
                    if (sum % 20 > 0) {
                        isSuccess = false;
                    }
                }
            } else {
                isSuccess = false;
            }
        } else {
            isSuccess = false;
        }
        determineSuccess();
    }

    public void withdrawal(int sum) {
        if (countHundredBills * 100 + countFiftyBills * 50 + countTwentyBills * 20 < sum || sum < 0) {
            isSuccess = false;
        } else {
            withdrawalHundredBills = sum / 100;
            countHundredBills -= withdrawalHundredBills;
            sum -= withdrawalHundredBills * 100;
            if (sum != 0) {
                countFiftyAndTwentyBills(sum);
            }
        }

        determineSuccess();
        if (isSuccess) {
            System.out.println("Сумма выдана:\n%s - номинал 100\n%s - номинал 50\n%s - номинал 20".formatted(withdrawalHundredBills, withdrawalFiftyBills, withdrawalTwentyBills));
        }
    }

    public void countFiftyAndTwentyBills(int sum) {
        if (countFiftyBills * 50 + countTwentyBills * 20 < sum) {
            isSuccess = false;
        } else {
            withdrawalFiftyBills = sum / 50;
            countFiftyBills -= withdrawalFiftyBills;
            sum -= withdrawalFiftyBills * 50;
            if (sum != 0) {
                countTwentyBills(sum);
            }
        }
    }

    public void countTwentyBills(int sum) {
        if (countTwentyBills * 20 < sum || sum % 20 != 0) {
            isSuccess = false;
        } else {
            withdrawalTwentyBills = sum / 20;
            countTwentyBills -= withdrawalTwentyBills;
        }
    }
}
