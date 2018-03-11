package iterator;

import java.util.List;

public class UserAggregate implements IUserAggregate {

    private List<User> users;

    public UserAggregate(List<User> users) {
        this.users = users;
    }

    public IIterator<User> getUserSimplyIterator() {
        return new IteratorSimple<>(this.users);
    }

    public IIterator<User> getUserRevIterator() {
        return new IteratorReverse<>(this.users);
    }
}
