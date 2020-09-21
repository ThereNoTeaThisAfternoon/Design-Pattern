package 创建型模式.prototype.improve;

public class Client {
	public static void main(String[] args) {
		System.out.println("原型模式完成对对象的创建");
		Sheep sheep = new Sheep("tom", 100, "white");

		sheep.friend = new Sheep("jack", 2, "black");

		Sheep sheep2 = (Sheep) sheep.clone();// 克隆
		Sheep sheep3 = (Sheep) sheep.clone();// 克隆
		Sheep sheep4 = (Sheep) sheep.clone();// 克隆
		Sheep sheep5 = (Sheep) sheep.clone();// 克隆
		Sheep sheep6 = (Sheep) sheep.clone();// 克隆

		System.out.println(sheep == sheep2);// false
		System.out.println(sheep.hashCode());// 125130493
		System.out.println(sheep2.hashCode());// 914504136
		System.out.println(sheep.equals(sheep));// true
		System.out.println(sheep.equals(sheep2));// false

		System.out.println("sheep2  " + sheep2 + " sheep2.friend" + sheep2.friend.hashCode());
		System.out.println("sheep3  " + sheep3 + " sheep3.friend" + sheep2.friend.hashCode());
		System.out.println("sheep4  " + sheep4 + " sheep4.friend" + sheep2.friend.hashCode());
		System.out.println("sheep5  " + sheep5 + " sheep5.friend" + sheep2.friend.hashCode());

		sheep2.setName("fa");
		System.out.println(sheep.getName());
		System.out.println(sheep2.getName());
		System.out.println(sheep4.getName());
		System.out.println(sheep.getName().hashCode() == sheep2.getName().hashCode());//false
		System.out.println(sheep.getName().equals(sheep2.getName()));//false

	}
}
