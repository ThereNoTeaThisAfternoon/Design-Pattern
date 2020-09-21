package 结构型模式.flyweight;

public class Client {
	public static void main(String[] args) {
		// 创建一个工厂类
		WebSiteFactory wFactory = new WebSiteFactory();
		// 客户要一个以新闻形式发布的网站
		WebSite webSite1 = wFactory.getWebSiteCategory("新闻");
		User user = new User();
		user.setName("Tom");
		webSite1.use(user);
		// 客户要一个以博客形式发布的网站
		WebSite webSite2 = wFactory.getWebSiteCategory("博客");
		user.setName("Jack");
		webSite2.use(user);
		// 客户要一个以博客形式发布的网站
		WebSite webSite3 = wFactory.getWebSiteCategory("博客");
		user.setName("smith");
		webSite3.use(user);
		// 客户要一个以博客形式发布的网站
		WebSite webSite4 = wFactory.getWebSiteCategory("博客");
		user.setName("king");
		webSite4.use(user);

		System.out.println("网站的分类共" + wFactory.getWebSiteCount() + "个");
	}
}
