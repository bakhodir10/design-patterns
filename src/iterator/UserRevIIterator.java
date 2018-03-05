package iterator;

import java.util.List;

public class UserRevIIterator implements IIterator<User> {
    private List<User> list;
    private int pos;

    public UserRevIIterator(List<User> list) {
        this.list = list;
        this.pos = this.list.size() - 1;
    }


    @Override
    public boolean hasNext() {
        return pos != -1;
    }

    @Override
    public User next() {
        return list.get(pos--);
    }
}
