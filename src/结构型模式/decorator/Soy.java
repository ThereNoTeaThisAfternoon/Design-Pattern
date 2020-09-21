package 结构型模式.decorator;

public class Soy extends Decorator {
	public Soy(Drink drink) {
		super(drink);
		// TODO Auto-generated constructor stub
		setDescription("豆浆");
		setPrice(0.5544332211f);
	}
}
