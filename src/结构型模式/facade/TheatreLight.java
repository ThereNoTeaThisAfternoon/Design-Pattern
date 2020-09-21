package 结构型模式.facade;

public class TheatreLight {
	private TheatreLight() {

	}

	private static TheatreLight instance = new TheatreLight();

	public static TheatreLight getInstance() {
		return instance;
	}

	public void on() {
		System.out.println("TheatreLight on");
	}

	public void off() {
		System.out.println("TheatreLight off");
	}

	public void dim() {
		System.out.println("TheatreLight dim");
	}

	public void bright() {
		System.out.println("TheatreLight bright");
	}

}
