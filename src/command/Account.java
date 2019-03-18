package command;

public class Account {

    private int id;
    private double balance;

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public void deposit(int amount) {
        double oldBalance = balance;
        balance += amount;
        System.out.println("Old balance: " + oldBalance + ", " + " Current Balance: " + balance);
    }

    public void withdraw(int amount) throws IllegalAccessException {
        if (amount > balance) {
            throw new IllegalAccessException("Balance is not sufficient");
        }
        double oldBalance = balance;
        balance += amount;
        System.out.println("Old balance: " + oldBalance + ", " + " Current Balance: " + balance);
    }
}
