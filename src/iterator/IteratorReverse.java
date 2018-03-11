package iterator;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorReverse<E> implements IIterator<E> {

    private ListIterator<E> userIterator;

    public IteratorReverse(List<E> list) {
        this.userIterator = list.listIterator(list.size());
    }

    @Override
    public boolean hasNext() {
        return this.userIterator.hasPrevious();
    }

    @Override
    public E next() {
        return this.userIterator.previous();
    }
}
