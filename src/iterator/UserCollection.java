package iterator;

import java.util.List;

public class UserCollection {
    List<User> list;

    public UserCollection(List<User> list) {
        this.list = list;
    }

    public IIterator<User> getUserSimplyIterator() {
        return new UserSimpIIterator(this.list);
    }

    public IIterator<User> getUserRevIterator() {
        return new UserRevIIterator(this.list);
    }
}
