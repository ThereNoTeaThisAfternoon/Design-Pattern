package 创建型模式.factory.abstractFactory.order;

import 创建型模式.factory.abstractFactory.pizza.BJCheesePizza;
import 创建型模式.factory.abstractFactory.pizza.BJPepperPizza;
import 创建型模式.factory.abstractFactory.pizza.Pizza;

public class BJFactory implements AbsFactory {

	public Pizza createPizza(String orderType) {
		// TODO Auto-generated method stub
		System.out.println("抽象工厂模式，北京披萨-------");
		Pizza pizza = null;
		// "str".equals(string) 防止空指针异常
		if ("cheese".equals(orderType))
			pizza = new BJCheesePizza();
		else if ("pepper".equals(orderType)) {
			pizza = new BJPepperPizza();
		}
		return pizza;
	}

}
