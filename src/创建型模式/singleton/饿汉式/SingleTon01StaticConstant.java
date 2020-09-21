package 创建型模式.singleton.饿汉式;

public class SingleTon01StaticConstant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 测试
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance == instance2);// true
		System.out.println("instance.hashCode():" + instance.hashCode());
		System.out.println("instance2.hashCode():" + instance2.hashCode());// hashCode相等
	}

}

//饿汉式（静态变量）
class Singleton {

	// 1、构造器私有化，外部不能new
	private Singleton() {
	}

	// 2、本类内部创建对象实例
	private static final Singleton instance = new Singleton();

	// 3、对外提供一个公有的静态方法，返回实例对象
	public static Singleton getInstance() {
		return instance;
	}
}