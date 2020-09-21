package 行为型模式.strategy.traditional;

public class Client {
    public static void main(String[] args) {
        Duck pekingDuck = new PekingDuck();
        Duck toyDuck = new ToyDuck();
        Duck wildDuck = new WildDuck();
        pekingDuck.display();
        toyDuck.display();
        wildDuck.display();
    }
}
