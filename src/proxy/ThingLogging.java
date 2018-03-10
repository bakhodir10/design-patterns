package proxy;

public class ThingLogging implements Thing, Logging {
    private Thing thing;

    public ThingLogging(Thing thing) {
        this.thing = thing;
    }

    public void pre() {
        System.out.println("Pre logging...");
    }

    @Override
    public void compute(String s) {
        pre();
        thing.compute(s);
        post();
    }

    public void post() {
        System.out.println("Post logging...");
    }
}
