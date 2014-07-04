package disgn;  //定义事件

import java.util.EventObject;

public class AEvent extends EventObject {

    private int value;

    public AEvent(Object source) {
        this(source, 0);

    }

    public AEvent(Object source, int newValue) {
        super(source);
        value = newValue;

    }

}