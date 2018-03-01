package observer;

public interface Subject {
    void registerObserver(Observer observer);

    void unRegisterObserver(Observer observer);

    void inform();
}
