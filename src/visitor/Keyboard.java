package visitor;

public class Keyboard implements ComputerPart {

    @Override
    public void accept(ComputePartVisitor visitor) {
        visitor.visit(this);
    }
}
