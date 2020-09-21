package 创建型模式.builder.improve;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 盖普通房子
		CommonHouse cHouse = new CommonHouse();
		// 准备创建房子的指挥者
		HouseDirector hDirector = new HouseDirector(cHouse);
		// 完成盖房子，返回产品（房子）
		House house = hDirector.constructHouse();
		System.out.println(house.getBaise());// null，没有注入
		
		System.out.println("\n------------------------------------\n");
		
		// 盖高楼
		HighBuilding hBuilding = new HighBuilding();
		HouseDirector hDirector2 = new HouseDirector(hBuilding);
		//高楼
		House house2 = hDirector2.constructHouse();

	}

}
