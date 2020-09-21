package com.principle.segregation;

public class Segregation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface1 bInterface1 = new B();
		A a = new A();
		a.depend1(bInterface1);
		a.depend2(bInterface1);
		a.depend3(bInterface1);
		
		Interface1 d = new D();
		C c = new C();
		c.depend1(d);
		c.depend4(d);
		c.depend5(d);
	}

}

//interface
interface Interface1 {
	void operation1();

	void operation2();

	void operation3();

	void operation4();

	void operation5();
}

class B implements Interface1 {
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

	public void operation5() {
		System.out.println("B implements operation5 ");
	};
}

class D implements Interface1 {
	public void operation1() {
		System.out.println("D implements operation1 ");
	}

	public void operation2() {
		System.out.println("D implements operation2 ");
	}

	public void operation3() {
		System.out.println("D implements operation3 ");
	};

	public void operation4() {
		System.out.println("D implements operation4 ");
	};

	public void operation5() {
		System.out.println("D implements operation5 ");
	};
}

class A {// A 类通过接口Interface1 依赖(使用) B类，但是只会用到1，2，3方法
	public void depend1(Interface1 i) {
		i.operation1();
	}

	public void depend2(Interface1 i) {
		i.operation2();
	}

	public void depend3(Interface1 i) {
		i.operation3();
	}
}

class C {//C 类通过接口Interface1 依赖D类，但是只会使用到1，4，5方法
	public void depend1(Interface1 i) {
		i.operation1();
	}

	public void depend4(Interface1 i) {
		i.operation4();
	}

	public void depend5(Interface1 i) {
		i.operation5();
	}
}
