package iterator;

import java.util.List;

public class UserCollection {
    List<User> list;

    public UserCollection(List<User> list) {
        this.list = list;
    }

    public UserIterator<User> getUserSimplyIterator() {
        return new UserSimplyIterator(this.list);
    }

    public UserIterator<User> getUserRevIterator() {
        return new UserRevIterator(this.list);
    }
}
