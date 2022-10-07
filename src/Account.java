import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

public class Account {
    AtomicLong money = new AtomicLong(0);
    public static long sum = 0;

    public void count(long diff) {
        System.out.printf("%s отправляет выручку %d рублей\n", Thread.currentThread().getName(), diff);
        long rezult = money.addAndGet(diff);
    }

    public long getCurrent() {
        return money.get();
    }

    public long sum(long[] magazine) {
        return sum = Arrays.stream(magazine).reduce(0, (x, y) -> x + y);
    }
}
