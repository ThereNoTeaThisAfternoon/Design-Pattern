package 行为型模式.template.ordinary;

//抽象类，表示豆浆
public abstract class SoyaMilk {

    // 模板方法，make，模板方法做成final，不让子类去覆盖
    final void make() {
        select();
        addCondiments();
        soak();
        beat();
    }

    // 选材
    void select() {
        System.out.println("第一步，选择新鲜黄豆。。。");
    }

    // 添加不同配料，抽象方法，子类具体实现
    abstract void addCondiments();

    // 侵泡
    void soak() {
        System.out.println("第三步，黄豆和配料开始侵泡，需要三个小时。。。");
    }

    // 黄豆和配料放到豆浆机打碎
    void beat() {
        System.out.println("第四步，黄豆和配料放到豆浆机中打碎。。。");
    }
}
