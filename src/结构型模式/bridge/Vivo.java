package 结构型模式.bridge;

public class Vivo implements Brand {

	public void open() {
		// TODO Auto-generated method stub
		System.out.println("Vivo手机开机。。。");
	}

	public void call() {
		// TODO Auto-generated method stub
		System.out.println("Vivo手机打电话。。。");
	}

	public void close() {
		// TODO Auto-generated method stub
		System.out.println("Vivo手机关机。。。");
	}

}
