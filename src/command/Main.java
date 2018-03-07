package command;

public class Main {
    public static void main(String[] args) {
        Receiver receiver = new Receiver(new User("C++"));

        Command command = new ConcreteCommand(receiver);

        Invoker invoker = new Invoker(command);
        Client client = new Client(invoker, receiver);

        client.submit();
    }
}
