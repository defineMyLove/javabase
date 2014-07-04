package process.method;

import process.create.MyRunnable;

/**
 * Created by zxl on 14-7-4.
 */
public class JoinTest {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable t1 = new MyRunnable();
        Thread thread1 = new Thread(t1, "A");
        Thread thread2 = new Thread(t1, "B");
        Thread thread4 = new Thread(t1, "C");
        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();
        thread4.start();
        thread4.join();

    }

}
