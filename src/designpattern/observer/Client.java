package designpattern.observer;

/**
 * Created by zxl on 14-9-2.
 */
public class Client {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Observer observer1 = new ConcreteObserver(subject, "observer1");
        Observer observer2 = new ConcreteObserver(subject, "observer2");
        Observer observer3 = new ConcreteObserver(subject, "observer3");
        subject.addObserver(observer1);
        subject.addObserver(observer2);
        subject.addObserver(observer3);
        subject.notice();
    }


}
