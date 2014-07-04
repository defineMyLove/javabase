package process.create;

import java.util.Date;

public class MyThread extends Thread
{  
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
    }  
    public static void main(String[] args) throws Exception  
    {  
        MyThread thread = new MyThread();
        thread.start();
    }
} 