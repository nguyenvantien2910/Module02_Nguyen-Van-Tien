package ra.thread;

public class ThreadPrintChar implements Runnable{
    private char printChar;
    private int count;

    public ThreadPrintChar(char printChar, int count) {
        this.printChar = printChar;
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 0; i < count; i++) {
            System.out.printf("In ki tu %s lan thu %s \n",printChar,(i+1));
        }
    }
}
