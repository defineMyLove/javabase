package designpattern.command;

/**
 * Created by zxl on 14-9-1.
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }
    public void action(){
        command.execute();
    }
}
