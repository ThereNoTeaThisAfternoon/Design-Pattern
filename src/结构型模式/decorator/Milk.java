package 结构型模式.decorator;

public class Milk extends Decorator {

	public Milk(Drink drink) {
		super(drink);
		// TODO Auto-generated constructor stub
		setDescription("牛奶");
		setPrice(1.11f);
	}

}
