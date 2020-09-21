package 创建型模式.singleton.懒汉式;

public class SingletonLazy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("线程不安全。。。。");
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance == instance2);
		System.out.println("instance.hashCode():" + instance.hashCode());
		System.out.println("instance2.hashCode():" + instance2.hashCode());
	}

}

//线程不安全，仅单线程下使用
class Singleton {
	// 构造器私有化，外部不能new
	private Singleton() {
	}

	// 本类内部创建实例对象
	private static Singleton instance;

	// 提供一个静态的公有方法，当使用到该方法时，才去创建 instance
	// 懒汉式
	public static Singleton getInstance() {
		if (instance == null)
			instance = new Singleton();
		return instance;
	}
}

//线程安全，同步方法，不建议
class Singleton2 {
	// 构造器私有化，外部不能new
	private Singleton2() {
	}

	// 本类内部创建实例对象
	private static Singleton2 instance;

	// 提供一个静态的公有方法，加入了同步处理代码，解决了线程安全问题
	// 懒汉式
	public static synchronized Singleton2 getInstance() {
		if (instance == null)
			instance = new Singleton2();
		return instance;
	}
}

//线程安全，同步代码块，不能使用
class Singleton3 {
	// 构造器私有化，外部不能new
	private Singleton3() {
	}

	// 本类内部创建实例对象
	private static Singleton3 instance;
	//有问题的
	public static Singleton3 getInstance() {
		if (instance == null) {
			synchronized (Singleton3.class) {
				instance = new Singleton3();
			}
		}
		return instance;
	}
}
