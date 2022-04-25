public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        int check = 250;
        int replenishment = 1350;
        boolean ReplenishmentOfMoreThanAThousand = true;

        int bonus;
        if (ReplenishmentOfMoreThanAThousand) {
            bonus = 1;
        } else {
            bonus = 0;
        }
        int accrual = replenishment / 100;
        int FinalScore = check + replenishment + accrual;

        System.out.println("Итоговый счет: " + FinalScore);
        System.out.println("Начисленный бонус: " + accrual);


    }

}
