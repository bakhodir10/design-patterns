package command;

public class Receiver {
    private User user;

    public Receiver(User user) {
        this.user = user;
    }

    public User action() {
        return this.user;
    }

    public User getUser() {
        return user;
    }
}
