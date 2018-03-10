package proxy;

public class bThing implements Thing {
    private String name;

    public bThing(String name) {
        this.name = name;
    }

    @Override
    public void compute(String s) {
        System.out.println(s + ": < " + name + " >");
    }
}
