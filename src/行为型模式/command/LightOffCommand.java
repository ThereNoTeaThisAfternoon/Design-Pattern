package 行为型模式.command;

public class LightOffCommand implements Command {
    //聚合LightReceiver
    LightReceiver lightReceiver;

    //构造器
    public LightOffCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        lightReceiver.off();
    }

    @Override
    public void undo() {
        lightReceiver.on();
    }
}
