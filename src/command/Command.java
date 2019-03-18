package command;

public interface Command {

    void execute() throws IllegalAccessException;

    void undo() throws IllegalAccessException;

    void redo() throws IllegalAccessException;
}
