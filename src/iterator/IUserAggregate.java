package iterator;

public interface IUserAggregate {

    IIterator<User> getUserSimplyIterator();

    IIterator<User> getUserRevIterator();
}
