package 结构型模式.bridge;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 获取小米折叠式手机（样式+品牌）
		Phone foldedPhone = new FoldedPhone(new XiaoMi());
		foldedPhone.open();
		foldedPhone.call();
		foldedPhone.close();
		System.out.println("-------------------------------");
		// 获取Vivo折叠式手机（样式+品牌）
		Phone phone2 = new FoldedPhone(new Vivo());
		phone2.open();
		phone2.call();
		phone2.close();
		System.out.println("--------------------------------");
		// 获取小米直立式手机
		Phone phone3 = new UpRightPhone(new XiaoMi());
		phone3.open();
		phone3.call();
		phone3.close();

	}

}
