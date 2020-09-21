package 创建型模式.factory.abstractFactory;

import 创建型模式.factory.abstractFactory.order.AbsFactory;
import 创建型模式.factory.abstractFactory.order.BJFactory;
import 创建型模式.factory.abstractFactory.order.LDFactory;
import 创建型模式.factory.abstractFactory.order.OrderPizza;

public class PizzaStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbsFactory factory = new LDFactory();
		new OrderPizza(factory);

	}

}
