package com.principle.segregation;

public class Segregation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 a1 = new A1();
		a1.depend1(new B1()); //A类通过方法去依赖B
		a1.depend2(new B1());
		a1.depend3(new B1());
		
		C1 c1 = new C1();
		c1.depend1(new D1());//C类通过方法去依赖B，D
		c1.depend4(new D1());
		c1.depend5(new D1());
	}

}

interface Interface2 {
	void operation1();

	void operation2();
}

interface Interface3 {
	void operation3();

	void operation4();
}

interface Interface4 {
	void operation5();
}

class B1 implements Interface2, Interface3 {
	public void operation1() {
		System.out.println("B implements operation1 ");
	}

	public void operation2() {
		System.out.println("B implements operation2 ");
	}

	public void operation3() {
		System.out.println("B implements operation3 ");
	};

	public void operation4() {
		System.out.println("B implements operation4 ");
	};

}

class D1 implements Interface2, Interface4 {
	public void operation1() {
		System.out.println("D implements operation1 ");
	}

	public void operation2() {
		System.out.println("D implements operation2 ");
	}

	public void operation5() {
		System.out.println("D implements operation5 ");
	};
}

class A1 {// A 类通过接口Interface1 依赖(使用) B类，但是只会用到1，2，3方法
	public void depend1(Interface2 i) {
		i.operation1();
	}

	public void depend2(Interface2 i) {
		i.operation2();
	}

	public void depend3(Interface3 i) {
		i.operation3();
	}
}

class C1 {//C 类通过接口Interface1 依赖D类，但是只会使用到1，4，5方法
	public void depend1(Interface2 i) {
		i.operation1();
	}

	public void depend4(Interface2 i) {
		i.operation2();
	}

	public void depend5(Interface4 i) {
		i.operation5();
	}
}































