package 结构型模式.adapter.classadapter;

//适配器类
public class VoltageAdapter extends Voltage220V implements IVoltage5V {

	public int output5V() {
		// TODO Auto-generated method stub
		// 获取到220V电压
		int srcV = output220V();
		int dst = srcV / 44;// 转成5V
		return dst;
	}

}
