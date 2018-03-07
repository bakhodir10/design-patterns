package command;

public class Client {
    private Invoker invoker;
    private Receiver receiver;

    public Client(Invoker invoker, Receiver receiver) {
        this.invoker = invoker;
        this.receiver = receiver;
    }

    public void submit() {
        this.invoker.call();
    }

    public User getResult() {
        return this.receiver.action();
    }
}
