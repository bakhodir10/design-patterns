package command;

public class Application {

    public static void main(String[] args) throws IllegalAccessException {
        Account account = new Account(1, 1050);
        Command depositCommand = new DepositCommand(account, 500);
        depositCommand.execute();
        depositCommand.undo();

        Command withdrawCommand = new WithdrawCommand(account, 200);
        withdrawCommand.execute();
    }
}
