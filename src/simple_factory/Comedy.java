package simple_factory;

public class Comedy implements IBook {
    private String name;

    public Comedy(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
