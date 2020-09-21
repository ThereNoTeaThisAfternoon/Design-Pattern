package 结构型模式.facade;

public class Stereo {
	private Stereo() {

	}

	private static Stereo instance = new Stereo();

	public static Stereo getInstance() {
		return instance;
	}

	public void on() {
		System.out.println("Stereo on");
	}

	public void off() {
		System.out.println("Stereo off");
	}

	public void up() {
		System.out.println("Stereo up voice");
	}

	public void down() {
		System.out.println("Stereo down voice");
	}

}
