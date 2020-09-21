package 结构型模式.flyweight;

public class ConcreteWebSite extends WebSite {
	// 共享的部分，内部状态
	private String type = "";// 网站发布的形式(类型)

	// 构造器
	public ConcreteWebSite(String type) {
		// TODO Auto-generated constructor stub
		this.type = type;
	}

	@Override
	public void use(User user) {
		// TODO Auto-generated method stub
		System.out.println("网站的发布形式为：" + type + "使用中。。。使用者为：" + user.getName());
	}

}
