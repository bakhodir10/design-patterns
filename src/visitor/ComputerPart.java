package visitor;

public interface ComputerPart {

    void accept(ComputePartVisitor visitor);
}
