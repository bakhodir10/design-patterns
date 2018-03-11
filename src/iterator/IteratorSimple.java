package iterator;

import java.util.Iterator;
import java.util.List;

public class IteratorSimple<E> implements IIterator<E> {

    private Iterator<E> userIterator;

    public IteratorSimple(List<E> list) {
        this.userIterator = list.listIterator();
    }

    @Override
    public boolean hasNext() {
        return this.userIterator.hasNext();
    }

    @Override
    public E next() {
        return this.userIterator.next();
    }
}
