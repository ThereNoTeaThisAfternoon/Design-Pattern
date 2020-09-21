package 创建型模式.singleton.双重检查;

public class SingletonDoubleCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("双重检查");
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance == instance2);
		System.out.println(instance.hashCode() == instance2.hashCode());
	}

}
//volatile：多线程情况下，保证可见性，防止指令重排

class Singleton {

	private Singleton() {
	}

	private static volatile Singleton instance;

	// 提供一个静态公有方法，加入双重检查代码，同时解决懒加载问题
	// 同时保证了效率，推荐使用
	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}