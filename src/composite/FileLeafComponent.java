package composite;

public class FileLeafComponent extends FileSystemComponent {

    public FileLeafComponent(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println(this.name);
    }
}
