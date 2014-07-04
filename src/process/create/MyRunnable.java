package process.create;

public class MyRunnable implements Runnable
{  
    public void run()  
    {  
        System.out.println(Thread.currentThread().getName());  
    }  
    public static void main(String[] args)  
    {  
        MyRunnable t1 = new MyRunnable();
        Thread thread1 = new Thread(t1, "MyThread1");
        thread1.start();
    }  
}  