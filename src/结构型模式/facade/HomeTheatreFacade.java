package 结构型模式.facade;

public class HomeTheatreFacade {

	// 定义各个子系统对象
	private TheatreLight theatreLight;
	private Popcorn popcorn;
	private Stereo stereo;
	private Projector projector;
	private Screen screen;
	private DVDPlayer dvdPlayer;

	// 构造器
	public HomeTheatreFacade() {
		super();
		this.theatreLight = TheatreLight.getInstance();
		this.popcorn = Popcorn.getInstance();
		this.stereo = Stereo.getInstance();
		this.projector = Projector.getInstance();
		this.screen = Screen.getInstance();
		this.dvdPlayer = DVDPlayer.getInstance();
	}

	// 操作
	public void ready() {
		popcorn.on();
		popcorn.pop();
		screen.down();
		projector.on();
		stereo.on();
		dvdPlayer.on();
		theatreLight.dim();
	}

	public void play() {
		dvdPlayer.on();
	}

	public void pause() {
		dvdPlayer.pause();
	}

	public void end() {
		popcorn.off();
		theatreLight.bright();
		screen.up();
		projector.off();
		stereo.off();
		dvdPlayer.off();
	}

}
