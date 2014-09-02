package designpattern.observer;

/**
 * Created by Administrator on 14-9-2.
 */
public class ConcreteObserver implements Observer {
    private String observerState;
    private String name;
    private Subject subject;

    public ConcreteObserver(Subject subject, String name)
    {
        this.subject = subject;
        this.name = name;
    }
    @Override
    public void update() {
        System.out.println("the ovserver's is update :"+name);
    }
}
