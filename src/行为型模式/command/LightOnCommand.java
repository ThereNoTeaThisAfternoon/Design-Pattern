package 行为型模式.command;

public class LightOnCommand implements Command {
    //聚合LightReceiver
    LightReceiver lightReceiver;

    //构造器
    public LightOnCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        //调用接收者的方法
        lightReceiver.on();
    }

    @Override
    public void undo() {
        //调用接收者的方法
        lightReceiver.off();
    }
}
