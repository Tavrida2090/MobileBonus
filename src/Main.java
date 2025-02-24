public class Main {
    public static void main(String[] args) {

        int account = 90; //начальный счет
        int payment = 1110; //сумма полонение
        int bonus;
        if (payment >= 1000) {
            bonus = payment / 100;
        } else {
            bonus = 0;
        }
        int summa = account + payment + bonus;
        System.out.println(summa);
    }
}
