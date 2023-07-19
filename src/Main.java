public class Main {
    public static void main(String[] args) {
        int score = 200; // сумма на счете до пополнения баланса
        int depositAmount = 1001; // сумма пополнения баланса
        int bonus; // бонус за пополнение счета
        if (depositAmount >= 1000) {
            bonus = depositAmount / 100;
        } else {
            bonus =0;
        }
        System.out.println("Бонус за пополнение: " + bonus + " рублей");
        System.out.println("Итоговый счёт: " + (score + depositAmount + bonus) + " рублей");
    }
}
