package 创建型模式.factory.factoryMethod.pizza;

public class BJCheesePizza extends Pizza {

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		setName("北京奶酪披萨");
		System.out.println("北京的奶酪披萨准备原材料");
	}
	
}
