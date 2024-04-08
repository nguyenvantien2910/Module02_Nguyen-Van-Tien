package bt;

public class Bt03 {
    public static void main(String[] args) {
        // Tạo và bắt đầu luồng cho số chẵn
        Thread evenThread = new Thread(new EvenPrinter());
        evenThread.start();

        // Tạo và bắt đầu luồng cho số lẻ
        Thread oddThread = new Thread(new OddPrinter());
        oddThread.start();
    }
}

// Luồng để in ra các số chẵn
class EvenPrinter implements Runnable {
    @Override
    public void run() {
        for (int i = 2; i <= 100; i += 2) {
            System.out.println("Even: " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Luồng để in ra các số lẻ
class OddPrinter implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i += 2) {
            System.out.println("Odd: " + i);
            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

