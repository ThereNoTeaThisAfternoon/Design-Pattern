package 行为型模式.mediator;

public class TV extends Colleague {
    public TV(Mediator mediator, String name) {
        super(mediator, name);
        //在创建这个同事对象时，将自己放入ConcreteMediator对象中【集合】
        mediator.Register(name, this);
    }

    public void sendTV(int stateChange) {
        sendMessage(stateChange);
    }

    @Override
    public void sendMessage(int stateChange) {
        //调用的中介者对象的getMessage
        this.getMediator().getMessage(stateChange, this.name);
    }

    public void startTV() {
        System.out.println("It's time TV started");
    }

    public void stopTV() {
        System.out.println("TV stopped");
    }
}
