package composite;

public class DrirectoryComposite extends FileSystemComposite {

    public DrirectoryComposite(String name) {
        super(name);
    }

    @Override
    public void print() {
        this.componentList.forEach(System.out::println);
    }
}
