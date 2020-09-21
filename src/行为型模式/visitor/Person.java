package 行为型模式.visitor;

public abstract class Person {
    //提供一个接口，让访问者可以访问
    public abstract void accept(Action action);
}
