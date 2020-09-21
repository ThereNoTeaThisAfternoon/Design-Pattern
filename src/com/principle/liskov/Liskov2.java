package com.principle.liskov;

public class Liskov2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 a = new A1();
		System.out.println("11-3=" + a.func1(11, 3));
		System.out.println("1-8=" + a.func1(1, 8));
		System.out.println("-------------------------");

		B1 b = new B1();
		// 因为B类不再继承A类，因此调用者，不会再func1做减法
		// 调用完成的功能就会很明确
		System.out.println("11+3=" + b.func1(11, 3));// 求出 11 + 3
		System.out.println("1+8=" + b.func1(1, 8));
		System.out.println("11-3=" + b.func2(11, 3));
		
		// 使用组合仍然可以使用到A类相关方法
		System.out.println("11-3=" + b.func3(11, 3));

	}

}

//创建一个更加基础的基类
class Base {
	// 更加基础的方法和成员写入Base类

}

//A类
class A1 extends Base {
	// 返回两个数的差
	public int func1(int num1, int num2) {
		return num1 - num2;
	}
}

//B类继承A
//增加了一个新功能，完成两个数相加，然后求和
class B1 extends Base {

	// 如果B类要使用A类方法，使用组合关系
	private A a = new A();

	// 这里，重写了A类的方法，可能是无意识重写父类方法，造成原有功能出现错误
	public int func1(int num1, int num2) {
		return num1 + num2;
	}

	public int func2(int num1, int num2) {
		return func1(num1, num2) + 9;
	}

	// 我们仍然想使用A的方法
	public int func3(int a, int b) {
		return this.a.func1(a, b);
	}
}
