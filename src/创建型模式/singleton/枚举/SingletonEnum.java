package 创建型模式.singleton.枚举;

public class SingletonEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton instance = Singleton.INSTANCE;
		Singleton instance2 = Singleton.INSTANCE;
		System.out.println(instance == instance2);
		
		System.out.println(instance.hashCode());
		System.out.println(instance2.hashCode());
		
		instance.sayOK();
		instance2.sayOK();
	}
}
//枚举，可以实现单例，强烈推荐
enum Singleton{
	INSTANCE;//属性
	public void sayOK() {
		System.out.println("OK");
	}
}