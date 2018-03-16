package visitor;

public class Monitor implements ComputerPart{

    @Override
    public void accept(ComputePartVisitor visitor) {
        visitor.visit(this);
    }
}
