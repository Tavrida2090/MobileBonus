public class Main {
    public static void main(String[] args) {

        int a = 100; //начальный счет
        int b = 1001; //сумма полонение
        int bonus;
        if (b >= 1000) {
            bonus = b / 100;
        } else {
            bonus = 0;
        }
        int summa = a + b + bonus;
        System.out.println(summa);
    }
}
