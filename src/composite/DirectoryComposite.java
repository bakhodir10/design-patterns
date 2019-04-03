package composite;

public class DirectoryComposite extends FileSystemComposite {

    public DirectoryComposite(String name) {
        super(name);
    }

    @Override
    public void print() {
        this.componentList.forEach(FileSystemComponent::print);
    }
}
