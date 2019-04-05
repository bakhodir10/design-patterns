package cor;

public class Address implements Chain {

    private String streetAddress;
    private String city;
    private String state;
    private String zipcode;
    private Chain nextChain;

    public Address(String streetAddress, String city, String state, String zipcode) {
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    @Override
    public void nextChain(Chain chain) {
        this.nextChain = chain;
    }

    @Override
    public void isValid() {
        if (canHandleRequest()) {
            this.nextChain.isValid();
        } else {
            return;
        }
    }

    @Override
    public boolean canHandleRequest() {
        return true;
    }
}
