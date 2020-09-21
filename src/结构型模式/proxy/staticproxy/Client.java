package 结构型模式.proxy.staticproxy;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 创建目标对象，被代理对象
		TeacherDao teacherDao = new TeacherDao();
		// 创建代理对象，同时将被代理对象传递给代理对象
		TeacherDaoProxy proxy = new TeacherDaoProxy(teacherDao);
		// 通过代理对象调用被代理对象方法
		// 即：执行的是代理对象的方法，代理对象再去调用目标对象的方法。
		proxy.teach();
	}

}
