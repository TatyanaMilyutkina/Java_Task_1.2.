public class Main {
    public static void main(String[] args) {

        int check = 200;
        int inReplenishment = 1500;

        boolean sum = inReplenishment >= 1000;
        int bonus = sum ? inReplenishment / 100 : 0;
        int sum2 = check + inReplenishment + bonus;

        System.out.println("Итого на счете клиента:" + sum2);
        System.out.println("Итого начислено бонусов:" + bonus);
    }

}
