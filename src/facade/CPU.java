package facade;

public class CPU {
    public void freeze() {
        System.out.println("Freezing...");
    }

    public void jump(long position) {
        System.out.println("Jumping : " + position);
    }

    public void execute() {
        System.out.println("Executing...");
    }

}
