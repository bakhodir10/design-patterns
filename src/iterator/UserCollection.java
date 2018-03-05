package iterator;

import java.util.List;

public class UserCollection {
    List<User> list;

    public UserCollection(List<User> list) {
        this.list = list;
    }

    public Iterator<User> getUserSimplyIterator() {
        return new UserSimpIterator(this.list);
    }

    public Iterator<User> getUserRevIterator() {
        return new UserRevIterator(this.list);
    }
}
