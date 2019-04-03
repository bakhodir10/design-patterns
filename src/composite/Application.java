package composite;

public class Application {

    public static void main(String[] args) {
        DriveComposite cDrive = new DriveComposite("C");
        DirectoryComposite appDir = new DirectoryComposite("application");
        DirectoryComposite dataDir = new DirectoryComposite("my data");
        DirectoryComposite courseDir = new DirectoryComposite("cs525");

        FileLeafComponent excelFile = new FileLeafComponent("excel file");
        FileLeafComponent wordFile = new FileLeafComponent("my word file");
        FileLeafComponent studentFile = new FileLeafComponent("student.doc");

        cDrive.addComponent(appDir);
        cDrive.addComponent(dataDir);
        dataDir.addComponent(courseDir);
        appDir.addComponent(excelFile);
        appDir.addComponent(wordFile);
        courseDir.addComponent(studentFile);

        appDir.print();
    }

}
