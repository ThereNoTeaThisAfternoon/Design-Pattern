package jkdSrc;

import java.util.Calendar;

public class FactoryCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//getInstance是Calendar一个静态方法，简单工厂模式
		Calendar calendar = Calendar.getInstance();
		// 月份下标从零开始
		System.out.println("年" + calendar.get(Calendar.YEAR));
		System.out.println("月" + (calendar.get(Calendar.MONTH) + 1));
		System.out.println("day" + calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println("hour" + calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println("minutes" + calendar.get(Calendar.MINUTE));
		System.out.println("second" + calendar.get(Calendar.SECOND));
	}

}
