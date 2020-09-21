package 结构型模式.adapter.objectadapter;

//适配器类
public class VoltageAdapter implements IVoltage5V {

	private Voltage220V voltage220v;// 聚合关系

	// 通过构造器，传入一个Voltage220V 对象实例。
	public VoltageAdapter(Voltage220V v) {
		super();
		this.voltage220v = v;
	}

	public int output5V() {
		int dst = 0;
		if (voltage220v != null) {
			int src = voltage220v.output220V();// 获取220V 电压
			System.out.println("使用对象适配器，进行适配。。。");
			dst = src / 44;
			System.out.println("适配完成，输出的电压为= " + dst);
		}
		return dst;
	}

}
