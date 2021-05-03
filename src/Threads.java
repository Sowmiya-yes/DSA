import java.math.BigInteger;

public class Threads implements Runnable {

    @Override
    public void run() {
        BigInteger product = new BigInteger("1");
        for(int i = 2; i <= 50; i++) {
            product = product.multiply(BigInteger.valueOf(i));
        }
        System.out.println(Thread.currentThread().getName() + " " + product);
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Threads threads = new Threads();
        System.out.println(Thread.currentThread().getName());
        Thread thread_1 = new Thread(threads);
        thread_1.start();
        Thread thread_2 = new Thread(threads);
        thread_2.start();
        Thread thread_3 = new Thread(threads);
        thread_3.start();
    }
}
