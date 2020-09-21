package 行为型模式.strategy;

public class Client {
    public static void main(String[] args) {
        Duck wildDuck = new WildDuck();
        wildDuck.display();
        wildDuck.fly();
        Duck toyDuck = new ToyDuck();
        toyDuck.display();
        toyDuck.fly();
        Duck pekingDuck = new PekingDuck();
        pekingDuck.display();
        pekingDuck.fly();
    }
}
