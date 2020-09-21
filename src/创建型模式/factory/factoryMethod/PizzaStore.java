package 创建型模式.factory.factoryMethod;

import 创建型模式.factory.factoryMethod.order.*;

public class PizzaStore {
	public static void main(String[] args) {
		
//		new BJOrderPizza();
//		new LDOrderPizza();

		String local = "bj";
		if (local.equals("bj"))
			// 创建北京口味的各种pizza
			new BJOrderPizza();
		else {
			//创建伦敦口味的各种pizza
			new LDOrderPizza();
		}

	}
}
