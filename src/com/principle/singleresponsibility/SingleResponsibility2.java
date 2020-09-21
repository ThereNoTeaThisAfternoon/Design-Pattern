package com.principle.singleresponsibility;

public class SingleResponsibility2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RoadVehicle roadVehicle = new RoadVehicle();
		AirVehicle airVehicle = new AirVehicle();
		roadVehicle.run("汽车");
		roadVehicle.run("摩托车");
		airVehicle.run("飞机");
	}

}
/**
 * 方式2
 * 1、遵守单一职责原则
 * 2、这样做改动很大，同时修改客户端
 * 3、改进：直接修改RoadVehicle类，改动的代码会比较少 =》 solution 3
 * @author しゅうはく
 *
 */
class RoadVehicle{
	public void run(String string) {
		System.out.println(string+"公路运行");
	}
}
class AirVehicle{
	public void run(String string) {
		System.out.println(string+"天空运行");
	}
}