package template;

public abstract class Game {

    protected abstract void initialize();

    protected abstract void start();

    public final void play() {
        initialize();
        start();
    }
}
