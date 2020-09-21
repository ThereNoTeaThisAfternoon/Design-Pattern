package 行为型模式.visitor;

//说明
//这里使用到了一个双分派，即首先在客户端程序中将具体的状态作为参数传递到Woman中
//然后Woman 类调用作为参数的“具体方法”中方法getWomanResult()，同时将自己（this）作为参数传入，完成了第二次分派。
public class Woman extends Person {
    @Override
    public void accept(Action action) {
        action.getWomanResult(this);
    }
}
