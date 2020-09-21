package 行为型模式.command;

//将命令的调用者和执行者解耦
public class Client {
    public static void main(String[] args) {
        //使用命令设计模式，完成通过遥控器，对电灯的操作
        //创建电灯的对象（接收者）
        LightReceiver lightReceiver = new LightReceiver();
        //创建电灯相关的开关命令
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);
        //需要一个遥控器来控制
        RemoteController remoteController = new RemoteController();
        //给我们的遥控器设置相关的命令，no = 0 表示电灯的开和关
        remoteController.setCommand(0, lightOnCommand, lightOffCommand);

        System.out.println("----------按下开灯按钮-----------");
        remoteController.onButtonWasPushed(0);
        System.out.println("----------按下关灯按钮-----------");
        remoteController.offButtonWasPushed(0);
        System.out.println("----------按下撤销按钮-----------");
        remoteController.undoButtonWasPushed();

        //使用命令设计模式，完成通过遥控器，对电视机的操作
        //创建电视机的对象（接收者）
        TVReceiver tvReceiver = new TVReceiver();
        TVOnCommand tvOnCommand = new TVOnCommand(tvReceiver);
        TVOffCommand tvOffCommand = new TVOffCommand(tvReceiver);

        remoteController.setCommand(1, tvOnCommand, tvOffCommand);
        System.out.println("----------按下电视机按钮-----------");
        remoteController.onButtonWasPushed(1);
        System.out.println("----------按下电视机按钮-----------");
        remoteController.offButtonWasPushed(1);
        System.out.println("----------按下撤销按钮-----------");
        remoteController.undoButtonWasPushed();


    }

}
