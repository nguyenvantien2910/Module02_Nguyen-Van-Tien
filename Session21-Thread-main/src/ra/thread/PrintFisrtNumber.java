package ra.thread;

public class PrintFisrtNumber implements Runnable{
    private int number;

    public PrintFisrtNumber(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        for (int i = 0; i <number ; i++) {
            System.out.printf("So tu nhien thu %s\n",i);
        }
    }
}
