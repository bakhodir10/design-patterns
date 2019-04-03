package composite;

public class DriveComposite extends FileSystemComposite {

    public DriveComposite(String name) {
        super(name);
    }

    @Override
    public void print() {
        this.componentList.forEach(e -> System.out.println(e.name));
    }
}
