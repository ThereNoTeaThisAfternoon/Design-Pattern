package 行为型模式.observer.improve;

public class Client {
    public static void main(String[] args) {
        //创建一个 WeatherData
        WeatherData weatherData = new WeatherData();
        //创建一个观察者
        CurrentConditions currentConditions = new CurrentConditions();
        //创建Google 观察者
        Google google = new Google();
        //注册到 weatherData中
        weatherData.registerObserver(currentConditions);
        weatherData.registerObserver(google);
        //测试
        System.out.println("通知各个注册的观察者");
        weatherData.setData(10f, 10f, 10f);
    }

}
