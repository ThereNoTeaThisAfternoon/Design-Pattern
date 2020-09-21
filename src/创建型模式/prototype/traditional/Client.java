package 创建型模式.prototype.traditional;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 传统方法
		Sheep sheep = new Sheep("tom", 100, "white");
		Sheep sheep2 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
		Sheep sheep3 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
		Sheep sheep4 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
		Sheep sheep5 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
		Sheep sheep6 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
		Sheep sheep7 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
		Sheep sheep8 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
		// ....
		System.out.println(sheep);
		System.out.println(sheep2);
		System.out.println(sheep3);
		System.out.println(sheep4);
		System.out.println(sheep5);
		// ....
	}

}
