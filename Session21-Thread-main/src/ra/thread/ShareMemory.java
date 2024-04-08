package ra.thread;

public class ShareMemory {
    public synchronized void printData(String threadName) {
        for (int i = 0; i < 10; i++) {
            System.out.printf("ThreadName : %s - %d\n", threadName, i);
        }
    }
}
