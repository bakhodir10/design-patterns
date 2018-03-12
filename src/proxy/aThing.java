package proxy;

public class aThing implements Thing {

    private String name;

    public aThing(String name) {
        this.name = name;
    }

    @Override
    public void compute(String s) {
        System.out.println(s + ": < " + name + " >");
    }
}
