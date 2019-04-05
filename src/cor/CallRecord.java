package cor;

public class CallRecord implements Chain {

    private Customer customer;
    private Agent agent;
    private String requestInfo;
    private boolean isValid;
    private boolean isASalesLead;

    public CallRecord(Customer customer, Agent agent, String requestInfo, boolean isValid,
        boolean isASalesLead) {
        this.customer = customer;
        this.agent = agent;
        this.requestInfo = requestInfo;
        this.isValid = isValid;
        this.isASalesLead = isASalesLead;
    }

    @Override
    public void nextChain(Chain chain) {
    }

    @Override
    public void isValid() {
        if (canHandleRequest()) {
            // save the data to the db
        } else {
            return;
        }
    }

    @Override
    public boolean canHandleRequest() {
        return true;
    }
}
