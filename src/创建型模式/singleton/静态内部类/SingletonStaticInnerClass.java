package 创建型模式.singleton.静态内部类;

public class SingletonStaticInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("使用静态内部类完成单例模式");
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance == instance2);
		System.out.println(instance.hashCode());
		System.out.println(instance2.hashCode());
	}

}

//静态内部类，推荐使用
//外部类被装载时，其静态内部类不会被装载，懒加载可用
//调用方法装载静态内部类，JVM装载类的时候是线程安全
class Singleton{
	//构造器私有化
	private Singleton() {}
	//写一个静态内部类，这类中有一个静态属性
	private static class SingletonInstance{
		private static final Singleton INSTANCE=new Singleton();
	}
	//提供一个静态的公有方法，直接返回SingletonInstance.INSTANCE
	public static Singleton getInstance() {
		return SingletonInstance.INSTANCE;
	}
	
}
