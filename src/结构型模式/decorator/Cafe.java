package 结构型模式.decorator;

public class Cafe {
	public static void main(String[] args) {
		// 装饰者模式下订单，2份巧克力+一份牛奶的LongBlack

		// 1、点一份LongBlack
		Drink order = new LongBlack();
		System.out.println(order.description + "费用为：" + order.cost());

		// 2、order 加入一份牛奶
		order = new Milk(order);
		System.out.println("描述为==" + order.getDescription() + "   总费用为：" + order.cost());

		// 3、order 加入份巧克力
		order = new Chocolate(order);
		System.out.println("描述为==" + order.getDescription() + "   总费用为：" + order.cost());

		// 4、order 加入份巧克力
		order = new Chocolate(order);
		System.out.println("描述为==" + order.getDescription() + "   总费用为：" + order.cost());

	}

}
