package 创建型模式.factory.simplefactory.order;

import 创建型模式.factory.simplefactory.pizza.CheesePizza;
import 创建型模式.factory.simplefactory.pizza.GreekPizza;
import 创建型模式.factory.simplefactory.pizza.Pizza;

//简单工厂模式
public class SimpleFactory {
	// 根据orderType 返回对应的Pizza对象
	public Pizza createPizza(String orderType) {
		Pizza pizza = null;
		System.out.println("使用简单工厂模式");
		if (orderType.equals("greek")) {
			pizza = new GreekPizza();
			pizza.setName("希腊披萨");
		} else if (orderType.equals("cheese")) {
			pizza = new CheesePizza();
			pizza.setName("奶酪披萨");
		} else if (orderType.equals("pepper")) {
			pizza = new CheesePizza();
			pizza.setName("胡椒披萨");
		}
		return pizza;

	}

	// 简单工厂模式，也叫静态工厂模式
	public static Pizza createPizza2(String orderType) {
		Pizza pizza = null;
		System.out.println("使用简单工厂模式");
		if (orderType.equals("greek")) {
			pizza = new GreekPizza();
			pizza.setName("希腊披萨");
		} else if (orderType.equals("cheese")) {
			pizza = new CheesePizza();
			pizza.setName("奶酪披萨");
		} else if (orderType.equals("pepper")) {
			pizza = new CheesePizza();
			pizza.setName("胡椒披萨");
		}
		return pizza;

	}

}
