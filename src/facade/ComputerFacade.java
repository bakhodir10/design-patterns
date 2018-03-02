package facade;

public class ComputerFacade {
    private CPU processor;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputerFacade() {
        this.processor = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void start() {
        processor.freeze();
        memory.load(1, new byte[]{1, 6, 0});
        processor.jump(3);
        processor.execute();
    }
}
