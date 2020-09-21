package 创建型模式.builder.improve;

//抽象的建造者
public abstract class HouseBuilder {
	protected House house = new House();

	// 将建造流程写好，抽象的方法
	public abstract void buildBasic();

	public abstract void buildWall();

	public abstract void roofed();

	// 建造好房子后，将产品（房子）返回
	public House buildHouse() {
		return house;
	}
}
