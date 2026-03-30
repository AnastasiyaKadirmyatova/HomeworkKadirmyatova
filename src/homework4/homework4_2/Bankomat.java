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
    public Bankomat(int count20Bills, int count50Bills, int count100Bills) {
        this.count20Bills = count20Bills;
        this.count50Bills = count50Bills;
        this.count100Bills = count100Bills;
    }

    public boolean deposit(int sum) {
        if (sum < 0 || sum % 10 != 0) {
            System.out.println("Операция не может быть выполнена");
            return false;
        } else {
            if (sum % 20 != 0 && sum > 50) {
                count50Bills += 1;
                sum -= 50;
            }
            count100Bills += (sum / 100);
            sum = sum % 100;
            if (sum == 0) {
                System.out.println("Операция выполнена");
                System.out.println("Сумма выдана: %sх100, %sх50, %sх20".formatted(count100Bills, count50Bills, count20Bills));
                return true;
            } else {
                while (sum % 50 != 0) {
                    count20Bills += 1;
                    sum -= 20;
                }
                count50Bills += sum / 50;
                }
            System.out.println("Операция выполнена");
            System.out.println("Сумма внесена: %sх100, %sх50, %sх20".formatted(count100Bills, count50Bills, count20Bills));
            return true;
            }
    }

    public boolean withdrawal(int sum) {
        int withdrawal100Bills = 0;
        int withdrawal50Bills = 0;
        int withdrawal20Bills = 0;

        if (sum < 0 || sum % 10 != 0) {
            System.out.println("Операция не может быть выполнена");
            return false;
        } else {
            if (sum % 20 != 0 && sum > 50 && count50Bills > 0) {
                count50Bills -= 1;
                withdrawal50Bills += 1;
                sum -= 50;
            }
            if (sum / 100 > count100Bills) {
                count100Bills -= (sum / 100);
                withdrawal100Bills += (sum / 100);
                sum -= 100 * count100Bills;
            } else {
                sum -= 100 * count100Bills;
                withdrawal100Bills += count100Bills;
                count100Bills = 0;
            }
            if (sum == 0) {
                return true;
            } else {
                while (sum % 50 != 0 && count20Bills > 0) {
                    count20Bills -= 1;
                    withdrawal20Bills += 1;
                    sum -= 20;
                }
                if (sum == 0) {
                    System.out.println("Сумма выдана: %sх100, %sх50, %sх20".formatted(withdrawal100Bills, withdrawal50Bills, withdrawal20Bills));
                    return true;
                } else {
                    if (count50Bills > sum / 50 && sum > 0) {
                        count50Bills -= sum / 50;
                        withdrawal50Bills += sum / 50;
                        sum -= 50 * count50Bills;
                    } else {
                        sum -= 50 * count50Bills;
                        withdrawal50Bills += count50Bills;
                        count50Bills = 0;
                    }
                }
                count20Bills -= sum / 20;
                withdrawal20Bills += sum / 20;
                System.out.println("Сумма выдана: %sх100, %sх50, %sх20".formatted(withdrawal100Bills, withdrawal50Bills, withdrawal20Bills));
                return true;
            }
        }
    }
}
