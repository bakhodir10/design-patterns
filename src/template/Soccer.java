package template;

public class Soccer extends Game {

    @Override
    protected void initialize() {
        System.out.println("Soccer initializes...");
    }

    @Override
    protected void start() {
        System.out.println("Soccer starts...");
    }
}
