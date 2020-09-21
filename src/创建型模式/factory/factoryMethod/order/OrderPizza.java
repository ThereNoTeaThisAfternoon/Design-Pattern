package 创建型模式.factory.factoryMethod.order;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import 创建型模式.factory.factoryMethod.pizza.Pizza;

public abstract class OrderPizza {
	Pizza pizza = null;
	String orderType;// 订购pizza类型

	// 定义一个抽象方法，createPizza，让各个工厂子类自己实现
	abstract Pizza createPizza(String orderType);

	// 构造器
	public OrderPizza() {
		do {
			orderType = gettype();
			pizza = createPizza(orderType);//抽象方法，由工厂子类完成
			// 输出pizza 制作的过程
			System.out.println("------------------");
			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.box();
			System.out.println("------------------");
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
