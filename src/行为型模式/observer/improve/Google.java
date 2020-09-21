package 行为型模式.observer.improve;

public class Google implements Observer {
    //温度、气压、湿度
    private float temperature;
    private float pressure;
    private float humidity;

    //更新天气情况，是由WeatherData 调用的，使用推送模式
    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    //显示
    private void display() {
        System.out.println("=======Google==========");
        System.out.println("***Google Temperature: " + temperature + "***");
        System.out.println("***Google Pressure: " + pressure + "***");
        System.out.println("***Google Humidity: " + humidity + "***");
    }

}
