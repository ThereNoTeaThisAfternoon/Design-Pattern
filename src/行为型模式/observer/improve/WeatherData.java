package 行为型模式.observer.improve;

import java.util.ArrayList;

/**
 * 是核心类
 * 1、包含最新的天气信息
 * 2、含有观察者集合，使用 ArrayList 管理
 * 3、当数据有更新时，就主动调用 ArrayList，通知所有的接入方就看到最新的消息
 */
public class WeatherData implements Subject {
    //温度、气压、湿度
    private float temperature;
    private float pressure;
    private float humidity;
    //观察者集合
    private ArrayList<Observer> observers;
    //此处加入新的第三方

    public WeatherData() {
        observers = new ArrayList<>();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void dataChange() {
        //调用接入方的update方法
//        currentConditions.update(getTemperature(), getPressure(), getHumidity());
        notifyObserver();
    }

    //当数据有更新时，就调用setData
    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        //调用dataChange，将最新的信息推送给currentConditions
        dataChange();
    }

    //注册一个观察者
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    //移除一个观察者
    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    //遍历所有的观察者，并通知
    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(temperature, pressure, humidity);
        }
    }
}
