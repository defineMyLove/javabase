package designpattern.chain;

/**
 * Created by zxl on 14-8-31.
 */
public abstract class Handler {
    /** 下一个责任对象**/
    private Handler handler;
    /** 处理方法 **/
    public abstract void handleRequet();

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

}
