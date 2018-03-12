package mediator;

public class ConcreteColleague1 implements Colleague {

    private String name;

    private Mediator mediator;

    public ConcreteColleague1(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
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
