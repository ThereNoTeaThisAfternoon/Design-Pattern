package 行为型模式.observer.traditional;

/**
 * 是核心类
 * 1、包含最新的天气信息
 * 2、CurrentConditions 对象
 * 3、当数据有更新时，就主动调用 CurrentConditions对象的 update(含 display) 这样接入方就看到最新的消息
 */
public class WeatherData {
    //温度、气压、湿度
    private float temperature;
    private float pressure;
    private float humidity;
    private CurrentConditions currentConditions;
    //此处加入新的第三方

    public WeatherData(CurrentConditions currentConditions) {
        this.currentConditions = currentConditions;
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
        currentConditions.update(getTemperature(), getPressure(), getHumidity());
    }

    //当数据有更新时，就调用setData
    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        //调用dataChange，将最新的信息推送给currentConditions
        dataChange();
    }

}
