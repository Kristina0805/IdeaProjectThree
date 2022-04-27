
public class Main {
    public static void main(String[] args) {

        int check = 250;
        int replenishment = 1500;

        int bonus;
        if (replenishment >= 1000) {
            bonus = 1;
        } else {
            bonus = 0;
            System.out.println("Бонусы не начисляются! Пополнение счета меньше 1000 руб.");
        }

        int accrual = (replenishment / 100) * bonus;
        int finalScore = check + replenishment + accrual;

        System.out.println("Итоговый счет: " + finalScore);
        System.out.println("Начисленный бонус: " + accrual);

    }

}
