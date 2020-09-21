package com.principle.inversion;

public class DependenceInversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();
		Email email = new Email();
		person.receive(email);
	}

}

class Email {
	public String getInfo() {
		return "电子邮件信息：Hello,World?";
	}
}

//完成 Person 接收消息的一个功能
//方式 1 完成
//1、简单，比较容易实现
//2、如果我们获取的对象是 微信、短信等等，则更新类，同时Person也要增加相应的接受方法
//3、解决思路，引入抽象的接口 IReceiver，表示接收者，这样Person类与IReceiver接口发生依赖
//	 因为Email，WeiXin 等等属于接受的范围，他们各自实现 IReceiver 接口即可，这样我们就符合DependenceInversionPrinciple
class Person {
	public void receive(Email email) {
		System.out.println(email.getInfo());
	}
}
