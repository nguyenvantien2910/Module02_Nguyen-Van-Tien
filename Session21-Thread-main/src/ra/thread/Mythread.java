package ra.thread;

public class Mythread extends Thread{
    private String threadName;
    private ShareMemory shareMemory;

    public Mythread(String threadName, ShareMemory shareMemory) {
        this.threadName = threadName;
        this.shareMemory = shareMemory;
    }

    public String getThreadName() {
        return threadName;
    }

    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }

    public ShareMemory getShareMemory() {
        return shareMemory;
    }

    public void setShareMemory(ShareMemory shareMemory) {
        this.shareMemory = shareMemory;
    }

    @Override
    public void run() {
        // hien thi 100 so dau tien
        shareMemory.printData(threadName);
    }
}
