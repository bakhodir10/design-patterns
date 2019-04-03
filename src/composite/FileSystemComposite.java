package composite;

import java.util.ArrayList;
import java.util.List;

public abstract class FileSystemComposite extends FileSystemComponent {

    public List<FileSystemComponent> componentList = new ArrayList<>();

    public FileSystemComposite(String name) {
        super(name);
    }

    public void addComponent(FileSystemComponent component) {
        this.componentList.add(component);
    }
}
