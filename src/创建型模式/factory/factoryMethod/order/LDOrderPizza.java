package 创建型模式.factory.factoryMethod.order;

import 创建型模式.factory.factoryMethod.pizza.LDCheesePizza;
import 创建型模式.factory.factoryMethod.pizza.LDPepperPizza;
import 创建型模式.factory.factoryMethod.pizza.Pizza;

public class LDOrderPizza extends OrderPizza {
	Pizza pizza = null;

	@Override
	Pizza createPizza(String orderType) {
		// TODO Auto-generated method stub
		if (orderType.equals("cheese")) {
			pizza = new LDCheesePizza();
		} else if (orderType.equals("pepper")) {
			pizza = new LDPepperPizza();
		}

		return pizza;
	}

}
