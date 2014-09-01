package designpattern.chain;

/**
 * Created by zxl on 14-8-31.
 * 责任链客户端
 */
public class Client {
    static private  Handler handler1,handler2,handler3;
    public static void main(String[] args) {
        handler1 = new ConcreteHandler();
        handler2 = new ConcreteHandler();
        handler3 = new ConcreteHandler();
        handler1.setHandler(handler2);
        handler2.setHandler(handler3);
        handler1.handleRequet();
    }
}

