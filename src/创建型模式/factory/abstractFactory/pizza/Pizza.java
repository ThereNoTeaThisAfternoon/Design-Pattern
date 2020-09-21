package 创建型模式.factory.abstractFactory.pizza;

//将Pizza类做成抽象类
public abstract class Pizza {
	protected String name;// Pizza名字

	@Override
	public String toString() {
		return "Pizza [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void prepare();// 准备原材料,不同的披萨不一样，因此，我们做成抽象方法

	public void bake() {
		System.out.println(name + "   baking...");
	}

	public void cut() {
		System.out.println(name + "   cutting...");
	}

	// 打包
	public void box() {
		System.out.println(name + "   boxing...");
	}

}
