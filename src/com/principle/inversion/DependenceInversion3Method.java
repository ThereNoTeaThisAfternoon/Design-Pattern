package com.principle.inversion;

public class DependenceInversion3Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

//方式1、通过接口传递实现依赖
//开关的接口
//interface IOpenAndClose {
//	public void open(ITV itv);// 抽象方法，接收接口
//}
//
//interface ITV {// ITV接口
//	public void play();
//}
//
////实现接口
//class OpenAndClose implements IOpenAndClose {
//	public void open(ITV itv) {
//		itv.play();
//	}
//}

//方式2、通过构造方法依赖传递
//interface IOpenAndClose {
//	public void open();// 抽象方法
//}
//
//interface ITV {// ITV接口
//	public void play();
//}
//
////实现接口
//class OpenAndClose implements IOpenAndClose {
//	public ITV itv;//成员
//	
//	public OpenAndClose(ITV itv) {//构造器
//		this.itv = itv;
//	}
//	
//	public void open() {
//		itv.play();
//	}
//}

//方式3、通过setter方法传递
interface IOpenAndClose {
	public void open();// 抽象方法

	public void setTv(ITV itv);
}

interface ITV {// ITV接口
	public void play();
}

//实现接口
class OpenAndClose implements IOpenAndClose {
	public ITV itv;// 成员

	public void setTv(ITV tv) {
		this.itv = tv;
	}
	
	public void open() {
		itv.play();
	}
}
