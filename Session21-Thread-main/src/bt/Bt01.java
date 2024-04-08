package bt;

public class Bt01 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("Giây thứ : %s \n", i);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Kết thúc !");
    }

    public static void main(String[] args) {
        Bt01 newThread = new Bt01();
        newThread.start();
    }
}
