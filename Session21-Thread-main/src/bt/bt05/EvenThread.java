package bt.bt05;

public class EvenThread extends Thread{
    @Override
    public void run() {
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("Odd :" + i);
            try {
                sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
