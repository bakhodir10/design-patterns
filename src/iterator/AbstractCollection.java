package iterator;

public interface AbstractCollection<E> {
    AbstractIterator<E> getUserSimplyIterator();

    AbstractIterator<E> getReverseIntIterator();
}
