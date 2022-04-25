public class Main {
    public static void main(String[] args) {

        int check = 250;
        int replenishment = 1350;
        boolean replenishmentOfMoreThanAThousand = true;

        int bonus;
        if (replenishmentOfMoreThanAThousand) {
            bonus = 1;
        } else {
            bonus = 0;
        }
        int accrual = replenishment / 100;
        int finalScore = check + replenishment + accrual;

        System.out.println("Итоговый счет: " + finalScore);
        System.out.println("Начисленный бонус: " + accrual);


    }

}
