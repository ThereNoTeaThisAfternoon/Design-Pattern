package 行为型模式.strategy.traditional;

public abstract class Duck {

    public Duck() {

    }

    public abstract void display();//显示鸭子信息

    public void quack() {
        System.out.println("鸭子嘎嘎叫。。。");
    }

    public void swim() {
        System.out.println("鸭子会游泳。。。");
    }

    public void fly() {
        System.out.println("鸭子会飞翔。。。");
    }
}

class WildDuck extends Duck {

    @Override
    public void display() {
        System.out.println("这是野鸭。。。");
    }
}

class PekingDuck extends Duck {

    @Override
    public void display() {
        System.out.println("这是北京鸭。。。");
    }

    @Override
    public void fly() {
        System.out.println("北京鸭不会飞翔。。。");

    }
}

class ToyDuck extends Duck {

    @Override
    public void display() {
        System.out.println("这是玩具鸭。。。");
    }

    //需要重写父类所有方法
    @Override
    public void quack() {
        System.out.println("玩具鸭不会叫。。。");
    }

    @Override
    public void swim() {
        System.out.println("玩具鸭不会游泳。。。");
    }

    @Override
    public void fly() {
        System.out.println("玩具鸭不会飞翔。。。");
    }
}