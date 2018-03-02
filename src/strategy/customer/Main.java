package strategy.customer;

public class Main {
    public static void main(String[] args) {
        Customer firstCustomer = new Customer(new NormalHourStrategy());

        // Normal billing
        firstCustomer.add(1.0, 1);

        // Start Happy Hour
        firstCustomer.setStrategy(new HappyHourStrategy());
        firstCustomer.add(1.0, 2);

        // new customer
        Customer secondCustomer = new Customer(new HappyHourStrategy());
        secondCustomer.add(0.8, 1);

        // The customers pays
        firstCustomer.printBill();

        // End Happy Hour
        secondCustomer.setStrategy(new NormalHourStrategy());
        secondCustomer.add(1.3, 2);
        secondCustomer.add(2.5, 1);
        secondCustomer.printBill();
    }
}
