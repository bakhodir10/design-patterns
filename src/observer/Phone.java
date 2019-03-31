package observer;

public class Phone implements Observer {

    private Weather wh;
    private String weather;

    public Phone(Weather wh) {
        this.wh = wh;
        this.wh.registerObserver(this);
    }

    @Override
    public void update(String newWeather) {
        this.weather = newWeather;
        System.out.printf("The phone has accepted weather change:  %s \n", this.weather);
    }
}
