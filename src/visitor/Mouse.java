package visitor;

public class Mouse implements ComputerPart {

    @Override
    public void accept(ComputePartVisitor visitor) {
        visitor.visit(this);
    }
}
