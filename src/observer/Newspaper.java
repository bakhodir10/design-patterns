package observer;

public class Newspaper implements Observer {
    private Weather wh;
    private String weather = "Warm";

    public Newspaper(Weather wh) {
        this.wh = wh;
    }

    @Override
    public void update() {
        this.weather = wh.getWeather();
        System.out.printf("The weather %s has been accepted by Newspaper\n", this.weather);
    }
}
