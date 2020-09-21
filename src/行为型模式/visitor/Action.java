package 行为型模式.visitor;

public abstract class Action {
    //得到男性的一个测评结果
    public abstract void getManResult(Man man);

    //得到女性一个测评结果
    public abstract void getWomanResult(Woman woman);
}
