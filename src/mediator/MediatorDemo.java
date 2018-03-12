package mediator;

public class MediatorDemo {

    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();

        Colleague col1 = new ConcreteColleague1("Bakhodir", mediator);

        Colleague col2 = new ConcreteColleague2("Javkhoir", mediator);

        col1.exchange(col1);

        col2.exchange(col1);
    }
}
