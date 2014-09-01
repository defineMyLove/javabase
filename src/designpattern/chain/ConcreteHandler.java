package designpattern.chain;

/**
 * Created by zxl on 14-8-31.
 * 具体的责任处理对象
 */
public class ConcreteHandler  extends  Handler
{

    /**
     * 处理方法(这里的业务逻辑就是，如果有下一个责任对象就给下一个处理，没有就自己处理)
     */
    @Override
    public void handleRequet() {
        if(getHandler()!=null){
            System.out.println("the request is pass to :"+getHandler());
            getHandler().handleRequet();
        }else{
            System.out.print("the request is handled here");
        }
    }
}
