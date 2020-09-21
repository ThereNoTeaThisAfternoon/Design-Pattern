package 行为型模式.command;

//创建命令接口
public interface Command {
    //执行某个操作
    void execute();

    //撤销某个操作
    void undo();
}
