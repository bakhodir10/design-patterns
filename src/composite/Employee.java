package composite;

import java.util.List;

public interface Employee<E> {

    void addChild(E elem);

    List<E> getChild();

    double getSalary();

    String getName();
}
