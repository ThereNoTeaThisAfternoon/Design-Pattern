package 结构型模式.adapter.classadapter;

public class Phone {

	// 充电
	public void charging(IVoltage5V voltage5v) {
		if (voltage5v.output5V() == 5)
			System.out.println("电压为 5V 可以充电。。。");
		else if (voltage5v.output5V() > 5)
			System.out.println("电压大于 5V 无法充电。。。");
		else {
			System.out.println("电压小于 5V 不建议充电。。。");
		}
	}

}
