package bt;

public class Bt02 extends Thread{
    @Override
    public void run() {
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            sum +=i;
        }

        System.out.printf("Tổng các số từ 1 ~ 1000 là : %d\n",sum);
    }

    public static void main(String[] args) {
        Bt02 newThread = new Bt02();

        newThread.start();
    }
}
