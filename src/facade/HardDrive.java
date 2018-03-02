package facade;

public class HardDrive {
    public byte[] read(long lba, int size) {
        return new byte[size];
    }
}
