package observer;

public class Newspaper implements Observer {
    private Weather wh;
    private String weather;

    public Newspaper(Weather wh) {
        this.wh = wh;
    }

    @Override
    public void update() {
        this.weather = wh.getWeather();
        System.out.printf("The %s weather type has been accepted by Newspaper\n", this.weather);
    }
}
