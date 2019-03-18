package command;

public class WithdrawCommand implements Command {

    private Account account;
    private int amount;

    public WithdrawCommand(Account account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void execute() throws IllegalAccessException {
        account.withdraw(amount);
    }

    @Override
    public void undo() {
        account.deposit(amount);
    }

    @Override
    public void redo() throws IllegalAccessException {
        account.withdraw(amount);
    }
}
