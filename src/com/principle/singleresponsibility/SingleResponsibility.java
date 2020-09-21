package com.principle.singleresponsibility;

public class SingleResponsibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Vehicle vehicle = new Vehicle();
			vehicle.run("摩托车");
			vehicle.run("火车");
			vehicle.run("飞机");
			
	}

}

//交通工具类
/**
 * 方式1
 * 1、在方式1的run方法中，违反了单一职责原则
 * 2、solution：根据交通工具运行方式不同，分解成不同类
 * @author しゅうはく
 *
 */
class Vehicle {
	public void run(String vehicle) {
		System.out.println(vehicle + "在公路上跑...");
	}
}