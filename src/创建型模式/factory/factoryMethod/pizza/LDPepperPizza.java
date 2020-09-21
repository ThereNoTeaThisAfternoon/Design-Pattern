package 创建型模式.factory.factoryMethod.pizza;

public class LDPepperPizza extends Pizza {

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		setName("伦敦胡椒披萨");
		System.out.println("伦敦的胡椒披萨准备原材料");
	}
	
}
