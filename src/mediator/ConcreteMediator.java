package mediator;

public class ConcreteMediator implements Mediator {

    @Override
    public void exchange(Colleague from, Colleague to) {
        System.out.println(from.getName() + " send a request to " + to.getName());
    }
}
