package 行为型模式.observer.traditional;

public class Client {
    public static void main(String[] args) {
        //创建接入方 currentConditions
        CurrentConditions currentConditions = new CurrentConditions();
        // 创建 WeatherData 并将 接入方 currentConditions 传递到 WeatherData中
        WeatherData weatherData = new WeatherData(currentConditions);
        //更新天气信息
        weatherData.setData(30, 150, 40);
        //天气情况变化
        System.out.println("==========天气情况发生变化===========");
        weatherData.setData(35, 155, 20);
    }
}
