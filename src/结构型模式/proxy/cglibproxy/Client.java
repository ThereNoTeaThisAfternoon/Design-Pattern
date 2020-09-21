package 结构型模式.proxy.cglibproxy;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 创建目标对象
		TeacherDao target = new TeacherDao();
		// 获取到代理对象，并且将目标对象传递给代理对象
//		TeacherDao proxyInstance = (TeacherDao) new ProxyFactory(target).getProxyInstance();
		// 执行代理对象的方法，触发intercept方法，从而实现对目标对象调用
//		proxyInstance.teach();
	}

}
