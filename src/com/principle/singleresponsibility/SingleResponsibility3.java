package com.principle.singleresponsibility;

public class SingleResponsibility3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Vehicle2 vehicle = new Vehicle2();
		 vehicle.run("汽车");
		 vehicle.runAir("飞机");
		 vehicle.runWater("轮船");
	}
}
/**
 * 方式3
 * 1、这种修改没有对原来类做大的修改，只是增加了方法
 * 2、虽然没有在类级别上遵守单一职责原则，但方法级别上，遵守单一职原则。
 * @author しゅうはく
 *
 */
class Vehicle2 {
	public void run(String string) {
		System.out.println(string + "在公路上跑。。。");
	}

	public void runAir(String string) {
		System.out.println(string + "在天上跑。。。");
	}

	public void runWater(String string) {
		System.out.println(string + "在水中跑。。。");
	}
}
