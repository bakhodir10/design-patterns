package composite;

public abstract class FileSystemComponent {

    public String name;

    public FileSystemComponent(String name) {
        this.name = name;
    }

    public abstract void print();

}
