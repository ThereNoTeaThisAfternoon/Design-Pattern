package 行为型模式.mediator;

public class CoffeeMachine extends Colleague {
    public CoffeeMachine(Mediator mediator, String name) {
        super(mediator, name);
        //在创建这个同事对象时，将自己放入ConcreteMediator对象中【集合】
        mediator.Register(name, this);
    }

    public void sendCoffeeMachine(int stateChange) {
        sendMessage(stateChange);
    }

    @Override
    public void sendMessage(int stateChange) {
        //调用的中介者对象的getMessage
        this.getMediator().getMessage(stateChange, this.name);
    }
    public void startCoffee(){
        System.out.println("It's time to start coffee !");
    }
    public void finishCoffee(){
        System.out.println("After 5 minutes!");
        System.out.println("Coffee is ok!");
        sendMessage(0);
    }
}
