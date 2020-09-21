package 行为型模式.observer.improve;

//让 WeatherData 来实现
public interface Subject {
    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObserver();
}
