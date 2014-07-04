package disgn; //定义接口,当事件触发时调用

import java.util.EventObject;

public interface AListener extends java.util.EventListener {

    public abstract void performed(AEvent e);

}


class B {

    public B() {

        A a = new A();

        a.addAListener(new AListener() {

            @Override
            public void performed(AEvent e) {
                   //do something
                System.out.printf("do something");
            }
        });

    }


}