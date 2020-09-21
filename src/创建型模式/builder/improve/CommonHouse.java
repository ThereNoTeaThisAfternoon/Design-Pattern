package 创建型模式.builder.improve;

public class CommonHouse extends HouseBuilder {

	@Override
	public void buildBasic() {
		// TODO Auto-generated method stub
		System.out.println("buildBasic。。普通房子打地基。。5米");
	}

	@Override
	public void buildWall() {
		// TODO Auto-generated method stub
		System.out.println("buildWall。。。普通房子砌墙。。10米");
	}

	@Override
	public void roofed() {
		// TODO Auto-generated method stub
		System.out.println("roofed。。。普通房子盖屋顶。。1000米");
	}

}
