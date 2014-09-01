package designpattern.command;

/**
 * Created by zxl on 14-9-1.
 * 命令指定接收者
 * 1.这个命令是干什么的
 * 2.这个命令的接收者是谁
 */
public class ConcreteCommand implements Command {
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    public Receiver getReceiver() {
        return receiver;
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
          receiver.action();
    }
}
