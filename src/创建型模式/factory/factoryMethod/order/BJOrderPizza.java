package 创建型模式.factory.factoryMethod.order;

import 创建型模式.factory.factoryMethod.pizza.BJCheesePizza;
import 创建型模式.factory.factoryMethod.pizza.BJPepperPizza;
import 创建型模式.factory.factoryMethod.pizza.Pizza;

public class BJOrderPizza extends OrderPizza {
	Pizza pizza = null;

	@Override
	Pizza createPizza(String orderType) {
		// TODO Auto-generated method stub
		if (orderType.equals("cheese")) {
			pizza = new BJCheesePizza();
		} else if (orderType.equals("pepper")) {
			pizza = new BJPepperPizza();
		}

		return pizza;
	}

}
