package 行为型模式.strategy;

public abstract class Duck {
    //属性，策略接口
    FlyBehavior flyBehavior;

    //其他属性 <-> 策略接口
    public Duck() {
    }

    public abstract void display();//显示鸭子信息

    public void fly() {
        //改进
        if (flyBehavior != null)
            flyBehavior.fly();
    }
}

class WildDuck extends Duck {

    //构造器，传入FlyBehavior 的对象
    public WildDuck() {
        flyBehavior = new GoodFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("这是野鸭。。。");
    }
}

class PekingDuck extends Duck {

    public PekingDuck() {
        flyBehavior = new NoFlyBehavior();
    }

    @Override
    public void display() {
        System.out.print("这是北京鸭。。。它已经死了。。。");
    }
}

class ToyDuck extends Duck {

    public ToyDuck() {
        flyBehavior = new BadFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("这是玩具鸭。。。");
    }
}