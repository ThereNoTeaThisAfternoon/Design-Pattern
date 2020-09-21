package 结构型模式.decorator;

public class Decorator extends Drink {

	private Drink obj;

	public Decorator(Drink drink) {// 聚合
		this.obj = drink;
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		// getPrice 自己的价格 + drink的价格
		return super.getPrice() + obj.cost();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		// 装饰者的描述+装饰者的价格+被装饰者的描述
		return super.description + " " + getPrice() + "  &&  " + obj.getDescription();
	}

}
