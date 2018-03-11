package template;

public class Football extends Game {

    @Override
    protected void initialize() {
        System.out.println("Football initializes...");
    }

    @Override
    protected void start() {
        System.out.println("Football starts...");
    }
}