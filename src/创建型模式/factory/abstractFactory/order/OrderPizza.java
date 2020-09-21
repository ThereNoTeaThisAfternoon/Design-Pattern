package 创建型模式.factory.abstractFactory.order;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import 创建型模式.factory.abstractFactory.pizza.Pizza;

public class OrderPizza {
	AbsFactory factory;

	// 构造器
	public OrderPizza(AbsFactory absFactory) {
		setFactory(absFactory);
	}

	private void setFactory(AbsFactory absFactory) {
		Pizza pizza = null;
		String orderType = "";// 用户输入
		this.factory = absFactory;

		do {
			orderType = gettype();
			// factory，可能是北京工厂子类，也可能是伦敦工厂子类
			pizza = factory.createPizza(orderType);
			if (pizza != null) {// 订购成功
				pizza.prepare();
				pizza.bake();
				pizza.cut();
				pizza.box();
			} else {
				System.out.println("订购失败");
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
