package observer;

public class TV implements Observer {

    private Weather wh;

    private String weather;

    public TV(Weather wh) {
        this.wh = wh;
        this.wh.registerObserver(this);
    }

    @Override
    public void update(String newWeather) {
        this.weather = newWeather;
        System.out.printf("The TV has accepted weather change:  %s \n", this.weather);
    }
}
