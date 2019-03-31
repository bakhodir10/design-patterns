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
    public void notifyObservers(String newWeather) {
        observers.forEach(observer -> observer.update(newWeather));
    }

    public void setWeather(String newWeather) {
        this.weather = newWeather;
        notifyObservers(newWeather);
    }
}
