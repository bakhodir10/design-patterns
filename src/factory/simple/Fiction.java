package factory.simple;

public class Fiction implements IBook {
    private String name;

    public Fiction(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
