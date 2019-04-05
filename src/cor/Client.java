package cor;

public class Client {

    public static void main(String[] args) {
        Address address = new Address("North O'Connor road", "Irving", "TX", "75062");
        Agent agent = new Agent("1", address);
        Customer customer = new Customer("Bakhodir", "Boydedaev", address, "1001", "@gmail.com");
        CallRecord record = new CallRecord(customer, agent, "Info", true, true);

        customer.nextChain(address);
        address.nextChain(agent);
        agent.nextChain(record);

        customer.isValid();
    }
}
