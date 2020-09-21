package 结构型模式.facade;

public class Screen {
	private Screen() {

	}

	private static Screen instance = new Screen();

	public static Screen getInstance() {
		return instance;
	}

	public void up() {
		System.out.println("Screen up");
	}

	public void down() {
		System.out.println("Screen down");
	}

}
