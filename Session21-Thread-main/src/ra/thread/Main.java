package ra.thread;

public class Main {
    public static void main(String[] args) {
        // khoiw tao luong
//        Mythread mythread1 = new Mythread();
//        // chay luong
//        mythread1.start();
//        Mythread mythread2 = new Mythread();
//        // chay luong
//        mythread2.start();
//
//        MyRunnable myRunnable = new MyRunnable();
//        Thread threadRunnable = new Thread(myRunnable);
//        threadRunnable.start();
//        ThreadPrintChar printA = new ThreadPrintChar('A',100);
//        ThreadPrintChar printB = new ThreadPrintChar('B',100);
//        PrintFisrtNumber printFisrtNumber = new PrintFisrtNumber(100);
//
//
//        Thread thread1 = new Thread(printA);
//        Thread thread2 = new Thread(printB);
//        Thread thread3 = new Thread(printFisrtNumber);
//
//
//        thread1.start();
//        thread2.start();
//        thread3.start();
//
//       Runnable run = ()->{
//           // statements
//       };

//       Thread thread = new Thread(){
//           @Override
//           public void run() {
//               super.run();
//           }
//       }
        ShareMemory shareMemory = new ShareMemory();
        ShareMemory shareMemory1 = new ShareMemory();
        Mythread thread1 = new Mythread("Luong 1",shareMemory);
        Mythread thread2 = new Mythread("Luong 2",shareMemory1);
        thread1.start();
        thread2.start();
    }
}
