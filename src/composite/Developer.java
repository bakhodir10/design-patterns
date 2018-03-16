package composite;

import java.util.LinkedList;
import java.util.List;

public class Developer<E> implements Employee<E> {

    private String name;
    private double salary;
    private List<E> subordinates;

    public Developer(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.subordinates = new LinkedList<>();
    }

    @Override
    public void addChild(E elem) {
        this.subordinates.add(elem);
    }

    @Override
    public double getSalary() {
        return 0;
    }

    public String getName() {
        return name;
    }

    public List<E> getChild() {
        return subordinates;
    }
}
