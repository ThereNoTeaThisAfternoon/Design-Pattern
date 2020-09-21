package 结构型模式.facade;

public class DVDPlayer {

	private DVDPlayer() {
		
	}
	
	// 使用单例模式，使用饿汉式
	private static DVDPlayer instance = new DVDPlayer();

	public static DVDPlayer getInstance() {
		return instance;
	}

	public void on() {
		System.out.println("DVD on");
	}

	public void off() {
		System.out.println("DVD off");
	}

	public void play() {
		System.out.println("DVD is playing");
	}

	public void pause() {
		System.out.println("DVD pause");
	}
	// ...
}
