public class Main {
    public static void main(String[] args) throws InterruptedException {
        long magazin1[] = {100, 200, 300};
        long magazin2[] = {1, 2, 3};
        long magazin3[] = {10, 20, 30};
        Account account = new Account();

        Thread thread1 = new Thread(null, () -> account.count(account.sum(magazin1)), "магазин1");
        Thread thread2 = new Thread(null, () -> account.count(account.sum(magazin2)), "магазин2");
        Thread thread3 = new Thread(null, () -> account.count(account.sum(magazin3)), "магазин3");

        thread1.start();
        thread2.start();
        thread3.start();

        thread3.join();
        thread2.join();
        thread1.join();
        System.out.println("Баланс после всех отправлений: " + account.getCurrent());
    }
}
