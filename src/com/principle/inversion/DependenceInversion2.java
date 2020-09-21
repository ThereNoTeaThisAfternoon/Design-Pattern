package com.principle.inversion;

public class DependenceInversion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//客户端无需改变
		
		Person2 person = new Person2();
		//接收email
		Email2 email2 = new Email2();
		person.receive(email2);
		
		//接收微信
		Weixin weixin = new Weixin();
		person.receive(weixin);
	}

}

//定义一个接口
interface IReceiver {
	public String getInfo();
}

class Email2 implements IReceiver {
	public String getInfo() {
		return "电子邮件信息：email";
	}
}
//增加微信
class Weixin implements IReceiver{
	public String getInfo() {
		return "微信信息： 微信";
	}
}

//方式2
class Person2 {
	//这里我们是对接口的依赖
	public void receive(IReceiver receiver) {
		System.out.println(receiver.getInfo());
	}
}