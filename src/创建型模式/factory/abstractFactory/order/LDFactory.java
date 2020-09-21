package 创建型模式.factory.abstractFactory.order;

import 创建型模式.factory.abstractFactory.pizza.LDCheesePizza;
import 创建型模式.factory.abstractFactory.pizza.LDPepperPizza;
import 创建型模式.factory.abstractFactory.pizza.Pizza;

public class LDFactory implements AbsFactory {

	public Pizza createPizza(String orderType) {
		// TODO Auto-generated method stub
		System.out.println("抽象工厂模式，伦敦披萨-------");
		Pizza pizza = null;
		// "str".equals(string) 防止空指针异常
		if ("cheese".equals(orderType))
			pizza = new LDCheesePizza();
		else if ("pepper".equals(orderType)) {
			pizza = new LDPepperPizza();
		}
		return pizza;
	}

}