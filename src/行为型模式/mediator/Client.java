package 行为型模式.mediator;

public class Client {
    public static void main(String[] args) {
        //创建一个中介者对象
        Mediator mediator = new ConcreteMediator();
        //创建Alarm并且加入到ConcreteMediator 对象的HashMap中
        Alarm alarm = new Alarm(mediator, "alarm");
        CoffeeMachine coffeeMachine = new CoffeeMachine(mediator, "coffeeMachine");
        Curtains curtains = new Curtains(mediator, "curtains");
        TV tv = new TV(mediator, "TV");
        //让闹钟发出一个消息
        alarm.sendMessage(0);
        coffeeMachine.finishCoffee();
        alarm.sendAlarm(1);
    }
}
