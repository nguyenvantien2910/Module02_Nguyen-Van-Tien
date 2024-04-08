package bt;

import static java.lang.Thread.sleep;

public class Bt04 implements Runnable {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Bt04());
        thread1.setPriority(Thread.MAX_PRIORITY);

        Thread thread2 = new Thread(new Bt04());
        thread2.setPriority(Thread.MIN_PRIORITY);


        thread1.start();
        System.out.println(thread1.hashCode());

        thread2.start();
        System.out.println(thread2.hashCode());
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.printf("Số tự nhiên thứ %d : \n", i + 1);
            try {
                sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
