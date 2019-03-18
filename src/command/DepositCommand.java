package command;

public class DepositCommand implements Command {

    private Account account;
    private int amount;

    public DepositCommand(Account account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void execute() {
        account.deposit(amount);
    }

    @Override
    public void undo() throws IllegalAccessException {
        account.withdraw(amount);
    }

    @Override
    public void redo() {
        account.deposit(amount);
    }
}
