package 创建型模式.factory.simplefactory.order;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import 创建型模式.factory.simplefactory.pizza.CheesePizza;
import 创建型模式.factory.simplefactory.pizza.GreekPizza;
import 创建型模式.factory.simplefactory.pizza.Pizza;

public class OrderPizza {
	String orderType;// 订购披萨的类型

	// 构造器
//	public OrderPizza() {
//		do {
//			orderType = gettype();
//			
//			// 输出pizza 制作的过程
//			System.out.println("------------------");
//			pizza.prepare();
//			pizza.bake();
//			pizza.cut();
//			pizza.box();
//			System.out.println("------------------");
//		} while (true);
//	}

	// 定义一个简单工厂对象
	SimpleFactory simpleFactory;
	Pizza pizza = null;

	// 构造器
	public OrderPizza(SimpleFactory simpleFactory) {
		setFactory(simpleFactory);
	}

	public void setFactory(SimpleFactory simpleFactory) {
		String orderType = "";// 用户输入
		this.simpleFactory = simpleFactory;// 设置简单工厂对象

		do {
			orderType = gettype();
			this.pizza = this.simpleFactory.createPizza(orderType);
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
