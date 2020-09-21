package 结构型模式.bridge;

public class UpRightPhone extends Phone {

	public UpRightPhone(Brand brand) {
		super(brand);
		// TODO Auto-generated constructor stub
	}

	public void open() {
		super.open();
		System.out.println("直立式样式手机。。。");
	}

	public void call() {
		super.call();
		System.out.println("直立式手机打电话。。。");
	}

	public void close() {
		super.close();
		System.out.println("直立式手机关机。。。");
	}

}
