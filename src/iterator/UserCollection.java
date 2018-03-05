package iterator;

import java.util.List;

public class UserCollection implements AbstractCollection<User> {
    List<User> list;

    public UserCollection(List<User> list) {
        this.list = list;
    }

    @Override
    public AbstractIterator<User> getUserSimplyIterator() {
        return new UserSimplyIterator(this.list);
    }

    @Override
    public AbstractIterator<User> getUserRevIterator() {
        return new UserRevIterator(this.list);
    }
}
