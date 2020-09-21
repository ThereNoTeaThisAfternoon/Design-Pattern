package 结构型模式.decorator;

// 具体的Decorator，这里就是调味品
public class Chocolate extends Decorator {

	public Chocolate(Drink drink) {
		super(drink);
		// TODO Auto-generated constructor stub
		setDescription("巧克力");
		setPrice(2.22f);// 当前调味品价格
	}

}
