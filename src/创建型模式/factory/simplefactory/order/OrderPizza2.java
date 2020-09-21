package 创建型模式.factory.simplefactory.order;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import 创建型模式.factory.simplefactory.pizza.Pizza;

public class OrderPizza2 {

	Pizza pizza = null;
	String orderType = "";

	// 构造器
	public OrderPizza2() {
		do {
			orderType = gettype();
			this.pizza = SimpleFactory.createPizza2(orderType);
			// 输出pizza
			if (pizza != null) {// 订购成功
				System.out.println("------------");
				pizza.prepare();
				pizza.bake();
				pizza.cut();
				pizza.box();
				System.out.println("------------");
			} else {
				System.out.println("订购披萨失败");
				break;
			}
		} while (true);
	}

	// 可以获取客户希望的披萨种类
	private String gettype() {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("input your type:");
			String line = in.readLine();
			return line;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getStackTrace());
			return "";
		}
	}
}
