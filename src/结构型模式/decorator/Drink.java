package 结构型模式.decorator;

public abstract class Drink {

	public String description;// 描述
	private float price = 0.0f;// 价格

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	// 计算价格的抽象方法
	// 子类来实现
	public abstract float cost();

}
