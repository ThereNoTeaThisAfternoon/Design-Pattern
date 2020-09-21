package com.principle.liskov;

public class Liskov {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		System.out.println("11-3=" + a.func1(11, 3));
		System.out.println("1-8=" + a.func1(1, 8));
		System.out.println("-------------------------");
		
		B b = new B();
		System.out.println("11-3=" + b.func1(11, 3));//本意想调用父类的 func1，求出 11 - 3
		System.out.println("1-8=" + b.func1(1, 8));
		System.out.println("11-3=" + b.func2(11, 3));
	}
}

//A类
class A {
	// 返回两个数的差
	public int func1(int num1, int num2) {
		return num1 - num2;
	}
}

//B类继承A
//增加了一个新功能，完成两个数相加，然后求和
class B extends A {
	//这里，重写了A类的方法，可能是无意识重写父类方法，造成原有功能出现错误
	public int func1(int num1, int num2) {
		return num1 + num2;
	}

	public int func2(int num1, int num2) {
		return func1(num1, num2) + 9;
	}
}