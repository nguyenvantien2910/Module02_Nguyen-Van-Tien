package ra.thread;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i%3 ==0){
                System.out.println("luong in chia cho 3 :"+i);
            }
        }
    }
}
