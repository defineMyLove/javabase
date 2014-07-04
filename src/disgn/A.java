package disgn;

import java.util.Vector;

public class A {

    private Vector aListeners = new Vector();

    private int value;

    public int getValue() {

        return value;

    }

    public void setValue(int newValue) {
        if (value != newValue) {
            value = newValue;
            AEvent evt = new AEvent(this, value);
            //如果值改变的话,就触发事件
            fireAEvent(evt);
        }
    }

    public synchronized void addAListener(AListener a) {
        aListeners.addElement(a);

    }

    public synchronized void removeAListener(AListener a) {
        aListeners.removeElement(a);

    }

    public void fireAEvent(AEvent evt) {
        Vector currentListeners = null;
        synchronized (this) {
            currentListeners = (Vector) aListeners.clone();

        }

        for (int i = 0; i < currentListeners.size(); i++) {
            AListener listener = (AListener) currentListeners.elementAt(i);
            listener.performed(evt);
        }
    }
}