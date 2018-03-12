package mediator;

public class ConcreteColleague2 implements Colleague {

    private String name;

    private Mediator mediator;

    public ConcreteColleague2(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void exchange(Colleague to) {
        this.mediator.exchange(this, to);
    }
}
