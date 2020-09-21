package 创建型模式.builder.improve;

public class HighBuilding extends HouseBuilder {

	@Override
	public void buildBasic() {
		// TODO Auto-generated method stub
		System.out.println("buildBasic。。高楼打地基。。500米");
	}

	@Override
	public void buildWall() {
		// TODO Auto-generated method stub
		System.out.println("buildWall。。高楼砌墙。。50米");
	}

	@Override
	public void roofed() {
		// TODO Auto-generated method stub
		System.out.println("roofed。。。高楼盖透明屋顶。。10米");
	}

}
