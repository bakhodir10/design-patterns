package iterator;

import java.util.List;

public class UserSimpIterator implements Iterator<User> {
    private List<User> list;
    private int pos = 0;

    public UserSimpIterator(List<User> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return this.pos != this.list.size();
    }

    @Override
    public User next() {
        return this.list.get(pos++);
    }
}
