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

    int count20Bills;
    int count50Bills;
    int count100Bills;

    boolean isSuccess = true;
    int withdrawalHundredBills = 0;
    int withdrawalFiftyBills = 0;
    int withdrawalTwentyBills = 0;

    public Bankomat(int count20Bills, int count50Bills, int count100Bills) {
        this.count20Bills = count20Bills;
        this.count50Bills = count50Bills;
        this.count100Bills = count100Bills;
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

    public boolean deposit(int sum) {
        if (sum > 0) {
            count100Bills += (sum / 100);
            if (sum % 100 > 0) {
                sum = sum % 100;
                count50Bills += (sum / 50);
                if (sum % 50 > 0) {
                    sum = sum % 50;
                    count20Bills += (sum / 20);
                    if (sum % 20 > 0) {
                        return !isSuccess;
                    }
                }
            } else {
                return !isSuccess;
            }
        } else {
            return !isSuccess;
        }
        determineSuccess();
        return isSuccess;
    }

    public void withdrawal(int sum) {
        if (count100Bills * 100 + count50Bills * 50 + count20Bills * 20 < sum || sum < 0) {
            isSuccess = false;
        } else {
            withdrawalHundredBills = sum / 100;
            count100Bills -= withdrawalHundredBills;
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
        if (count50Bills * 50 + count20Bills * 20 < sum) {
            isSuccess = false;
        } else {
            withdrawalFiftyBills = sum / 50;
            count50Bills -= withdrawalFiftyBills;
            sum -= withdrawalFiftyBills * 50;
            if (sum != 0) {
                countTwentyBills(sum);
            }
        }
    }

    public void countTwentyBills(int sum) {
        if (count20Bills * 20 < sum || sum % 20 != 0) {
            isSuccess = false;
        } else {
            withdrawalTwentyBills = sum / 20;
            count20Bills -= withdrawalTwentyBills;
        }
    }
}
