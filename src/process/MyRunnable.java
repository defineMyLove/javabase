package process;

public class MyRunnable implements Runnable
{  
    public void run()  
    {  
        System.out.println(Thread.currentThread().getName());  
    }  
    public static void main(String[] args)  
    {  
        MyRunnable t1 = new MyRunnable();  
        MyRunnable t2 = new MyRunnable();  
        Thread thread1 = new Thread(t1, "MyThread1");  
        Thread thread2 = new Thread(t2);  
        thread2.setName("MyThread2");  
        thread1.start();  
        thread2.start();  
    }  
}  