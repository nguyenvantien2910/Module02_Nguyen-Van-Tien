package bt.bt05;

public class TestThread {
    public static void main(String[] args) {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();

        oddThread.start();
        evenThread.start();

        try {
            oddThread.join();
            System.out.println("In xong các số lẻ");

            evenThread.join();
            System.out.println("In xong các số chẵn");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
