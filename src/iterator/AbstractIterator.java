package iterator;

public interface AbstractIterator<E> {
    boolean hasNext();

    E next();
}
