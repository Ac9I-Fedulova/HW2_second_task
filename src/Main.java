public class Main {
    public static void main(String[] args) {

        int balance = 150; // начальный баланс счёта

        int rub = 100; // сумма пополнения для 1 бонусного рубля
        int replenishment = 200; // пополнение счёта
        int bonus = (replenishment / rub); // количество бонусных рублей

        if (replenishment > 1000) {
            System.out.println(balance + replenishment + bonus);
        } else {
            System.out.println(replenishment + balance);
        }
    }
}