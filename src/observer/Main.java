package observer;

public class Main {
    public static void main(String[] args) {
        Weather weather = new Weather();

        Newspaper newspaper = new Newspaper(weather);
        TV tv = new TV(weather);

        weather.registerObserver(newspaper);
        weather.registerObserver(tv);

        weather.setWeather("cloud");
        weather.inform();

        weather.unRegisterObserver(newspaper);
        weather.unRegisterObserver(tv);

        weather.setWeather("shiny");
        weather.inform();
    }
}
