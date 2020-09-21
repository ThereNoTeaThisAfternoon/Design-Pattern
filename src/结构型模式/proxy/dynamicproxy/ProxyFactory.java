package 结构型模式.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
	// 维护一个目标对象，Object
	private Object target;

	// 构造器，对target目标对象初始化
	public ProxyFactory(Object target) {
		this.target = target;
	}

	// 给目标对象生成一个代理对象
	public Object getProxyInstance() {
		// param 1 ClassLoader loader：指定当前目标对象使用的类加载器，获取类加载器方法固定
		// param 2 Class<?>[] interfaces：目标对象实现的接口类型，使用泛型方法确认类型
		// param 3 InvocationHandler h：事件处理，执行目标对象方法时，会触发 事件处理器方法，会把当前执行的目标对象方法作为一个参数传入。
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
				new InvocationHandler() {
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						// TODO Auto-generated method stub
						System.out.println("JDK代理开始。。。");
						// 通过反射机制调用目标对象的方法
						Object returnVal = method.invoke(target, args);
						System.out.println("JDK代理提交。。。");
						return returnVal;
					}
				});
	}
}
