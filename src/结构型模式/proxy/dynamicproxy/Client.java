package 结构型模式.proxy.dynamicproxy;

public class Client {
	public static void main(String[] args) {
		// 创建一个目标对象
		ITeacherDao target = new TeacherDao();
		// 给目标对象创建代理对象，
		ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(target).getProxyInstance();
		// proxyInstanceclass com.sun.proxy.$Proxy0：内存中动态生成了代理对象
		System.out.println("proxyInstance" + proxyInstance.getClass());
		// 通过代理对象调用目标对象方法
		proxyInstance.teach();
	}
}
