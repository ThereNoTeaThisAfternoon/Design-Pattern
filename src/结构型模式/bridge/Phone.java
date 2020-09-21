package 结构型模式.bridge;

public abstract class Phone {
	// 组合品牌
	private Brand brand;

	// 构造器，聚合
	public Phone(Brand brand) {
		super();
		this.brand = brand;
	}

	protected void open() {
		this.brand.open();
	}

	protected void call() {
		this.brand.call();
	}

	protected void close() {
		this.brand.close();
	}

}
