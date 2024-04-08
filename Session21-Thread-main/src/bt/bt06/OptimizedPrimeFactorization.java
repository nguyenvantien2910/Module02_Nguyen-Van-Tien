package bt.bt06;

public class OptimizedPrimeFactorization extends Thread{
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2 || num == 3) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            isPrime(i);
            System.out.println(i);
        }
        System.out.println("Đã hoàn thành! (Optimized)");
    }
}
