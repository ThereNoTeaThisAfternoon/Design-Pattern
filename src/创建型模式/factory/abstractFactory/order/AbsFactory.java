package 创建型模式.factory.abstractFactory.order;

import 创建型模式.factory.abstractFactory.pizza.Pizza;

//这是一个抽象工厂模式的抽象层
public interface AbsFactory {
	// 让工厂子类来具体实现
	Pizza createPizza(String orderType);
}
