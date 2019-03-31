package observer;

public class Main {

    public static void main(String[] args) {
        Weather weather = new Weather();

        Phone phone = new Phone(weather);
        TV tv = new TV(weather);

        weather.setWeather("cloud");

        weather.unRegisterObserver(phone);
        weather.unRegisterObserver(tv);

        weather.setWeather("shiny");
    }
}
