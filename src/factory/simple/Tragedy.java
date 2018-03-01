package factory.simple;

public class Tragedy implements IBook {
    private String name;

    public Tragedy(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
