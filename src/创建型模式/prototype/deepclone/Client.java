package 创建型模式.prototype.deepclone;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		DeepPrototype d = new DeepPrototype();
		d.name = "牛大";
		d.deepC = new DeepCloneableTarget("大牛", "二牛");

		// 方式一 深拷贝
//		DeepPrototype d2 = (DeepPrototype) d.clone();
//		System.out.println("d.name  " + d.name + "  d.deepC" + d.deepC.hashCode());
//		System.out.println("d2.name  " + d2.name + "  d2.deepC" + d2.deepC.hashCode());

		// 方式二 深拷贝
		DeepPrototype d2 = (DeepPrototype) d.deepClone();
		System.out.println("d.name  " + d.name + "  d.deepC---" + d.deepC.hashCode());
		System.out.println("d2.name  " + d2.name + "  d2.deepC---" + d2.deepC.hashCode());
	}

}
