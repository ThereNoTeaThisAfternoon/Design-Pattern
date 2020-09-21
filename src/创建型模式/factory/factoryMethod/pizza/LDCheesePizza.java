package 创建型模式.factory.factoryMethod.pizza;

public class LDCheesePizza extends Pizza {

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		setName("伦敦奶酪披萨");
		System.out.println("伦敦的奶酪披萨准备原材料");
	}

}
