package 行为型模式.observer.improve;

/**
 * 显示当前天气情况，（可以理解成气象站自己的网站）
 */
public class CurrentConditions implements Observer{
    //温度、气压、湿度
    private float temperature;
    private float pressure;
    private float humidity;

    //更新天气情况，是由WeatherData 调用的，使用推送模式
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    //显示
    private void display() {
        System.out.println("========CurrentConditions=========");
        System.out.println("***Today mTemperature: " + temperature + "***");
        System.out.println("***Today mPressure: " + pressure + "***");
        System.out.println("***Today mHumidity: " + humidity + "***");
    }

}
