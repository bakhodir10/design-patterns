package dynamic_proxy;

public class BankServiceImp implements BankService {

    @Override
    public void deposit() {
        System.out.println("Making a deposit");
    }

    @Override
    public void withdraw() {
        System.out.println("Withdrawing some money");
    }
}
