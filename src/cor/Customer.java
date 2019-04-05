package cor;

public class Customer implements Chain {

    private String firstName;
    private String lastName;
    private Address address;
    private String phone;
    private String email;
    private Chain nextChain;

    public Customer(String firstName, String lastName, Address address, String phone,
        String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.email = email;
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
