package 创建型模式.singleton.饿汉式;

public class Singleton02StaticCodeBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton2 instance = Singleton2.getInstance();
		Singleton2 instance2 = Singleton2.getInstance();
		System.out.println(instance == instance2);// true
		System.out.println("instance.hashCode():" + instance.hashCode());
		System.out.println("instance2.hashCode():" + instance2.hashCode());// hashCode相等
	}

}

//饿汉式（静态代码块）
class Singleton2 {
	// 1、构造器私有化，外部不能new
	private Singleton2() {
	}

	// 2、本类内部创建对象实例
	private static final Singleton2 instance;

	static {// 在静态代码块中，创建单例对象
		instance = new Singleton2();
	}

	// 3、对外提供一个公有的静态方法，返回实例对象
	public static Singleton2 getInstance() {
		return instance;
	}
}
