package strategy.customer;

import java.util.LinkedList;
import java.util.List;

public class Customer {
    private List<Double> drinks;
    private BillingStrategy strategy;

    public Customer(BillingStrategy strategy) {
        this.drinks = new LinkedList<>();
        this.strategy = strategy;
    }

    public void add(double price, int quantity) {
        drinks.add(strategy.getActPrice(price * quantity));
    }

    public void printBill() {
        double sum = 0;
        for (double d : drinks) {
            sum += d;
        }
        System.out.println("Total due: " + sum);
        drinks.clear();
    }

    public void setStrategy(BillingStrategy strategy) {
        this.strategy = strategy;
    }
}
