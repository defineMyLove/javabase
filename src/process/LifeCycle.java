package process;

/**
 * 线程的生命周期
 * 1.新创建
 * 2.可运行
 * 3.运行
 * 4.冻结
 * 5.死亡
 */
public class LifeCycle extends Thread
{  
    public void run()  
    {  
        int n = 0;  
        while ((++n) < 1000);          
    }  
       
    public static void main(String[] args) throws Exception  
    {  
        LifeCycle thread1 = new LifeCycle();  
        System.out.println("isAlive: " + thread1.isAlive());  
        thread1.start();  
        System.out.println("isAlive: " + thread1.isAlive());  
        thread1.join();  // 等线程thread1结束后再继续执行
        System.out.println("thread1已经结束!");  
        System.out.println("isAlive: " + thread1.isAlive());  
    }  
}  