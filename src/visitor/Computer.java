package visitor;

public class Computer implements ComputerPart {

    private ComputerPart[] computerParts;

    public Computer() {
        this.computerParts = new ComputerPart[]{new Keyboard(), new Monitor(), new Mouse()};
    }

    @Override
    public void accept(ComputePartVisitor visitor) {
        for (int i = 0; i < computerParts.length; i++) {
            computerParts[i].accept(visitor);
        }
        visitor.visit(this);
    }
}
