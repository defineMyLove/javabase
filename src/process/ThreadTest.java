package process;

/**
 * Created by zxl on 14-6-27.
 * 在Java中创建线程有两种方法：使用Thread类和使用Runnable接口。
 * 任何一个Java程序都必须有一个主线程。学习Java多线程，需要先从用Thread类创建线程开始。
 */
public class ThreadTest extends Thread   {
    public void run()
    {
        System.out.println(this.getName());
    }
    public static void main(String[] args)
    {
        System.out.println(Thread.currentThread().getName());
        ThreadTest thread1 = new ThreadTest();
        ThreadTest thread2 = new ThreadTest ();
        thread1.start();
        thread2.start();
    }
}
