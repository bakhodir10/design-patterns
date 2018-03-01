package observer;

import java.util.LinkedList;
import java.util.List;

public class Weather implements Subject {

    private String weather;
    private List<Observer> observers;

    public Weather() {
        this.observers = new LinkedList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unRegisterObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void inform() {
        observers.forEach(Observer::update);
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }
}
