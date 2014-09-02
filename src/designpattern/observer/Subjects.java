package designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 14-9-2.
 */
public abstract class   Subjects {
    private List<Observer> observers = new ArrayList<Observer>();

    /// 增加观察者
    public void addObserver(Observer observer)
    {
        observers.add(observer);
    }

    /// 移除观察者
    public void removeObserver(Observer observer)
    {
        observers.remove(observer);
    }

    /// 向观察者（们）发出通知
    public void notice()
    {
        for (Observer o : observers)
        {
            o.update();
        }
    }

}
