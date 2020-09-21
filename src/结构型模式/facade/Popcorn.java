package 结构型模式.facade;

public class Popcorn {

	private Popcorn() {

	}

	private static Popcorn instance = new Popcorn();

	public static Popcorn getInstance() {
		return instance;
	}

	public void on() {
		System.out.println("Popcorn on");
	}

	public void off() {
		System.out.println("Popcorn off");
	}

	public void pop() {
		System.out.println("Popcorn is poping");
	}

}
