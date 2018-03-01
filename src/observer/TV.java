package observer;

public class TV implements Observer {
    private Weather wh;

    private String weather;

    public TV(Weather wh) {
        this.wh = wh;
    }

    @Override
    public void update() {
        this.weather = wh.getWeather();
        System.out.printf("The %s weather type has been accepted by TV\n", this.weather);
    }
}
