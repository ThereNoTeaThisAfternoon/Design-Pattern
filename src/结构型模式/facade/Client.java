package 结构型模式.facade;

public class Client {
	public static void main(String[] args) {
		// 统一接口
		HomeTheatreFacade hFacade = new HomeTheatreFacade();
		hFacade.ready();
		hFacade.end();
	}

}
