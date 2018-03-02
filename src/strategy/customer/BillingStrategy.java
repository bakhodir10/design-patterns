package strategy.customer;

public interface BillingStrategy {
    double getActPrice(double rawPrice);
}
