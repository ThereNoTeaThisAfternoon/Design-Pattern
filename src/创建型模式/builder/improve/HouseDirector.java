package 创建型模式.builder.improve;

//指挥者，指定制作流程，返回产品
public class HouseDirector {
	HouseBuilder hBuilder = null;

	// 构造器 传入 houseBuilder
	public HouseDirector(HouseBuilder houseBuilder) {
		this.hBuilder = houseBuilder;
	}

	// 通过setter 传入 houseBuilder
	public void sethBuilder(HouseBuilder hBuilder) {
		this.hBuilder = hBuilder;
	}

	// 如何处理建造房子流程，交给指挥者
	public House constructHouse() {
		hBuilder.buildBasic();
		hBuilder.buildWall();
		hBuilder.roofed();
		return hBuilder.buildHouse();
	}

}
