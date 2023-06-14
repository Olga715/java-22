public class Main {
    public static void main(String[] args) {
        int amount = 100;
        int refill = 2_200;
        int bonus;
        if (refill > 1000) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }
        int total = amount + refill + bonus;

        System.out.printf("Итоговый счет: " + total);
        System.out.printf(" Бонус: " + total);
    }
}