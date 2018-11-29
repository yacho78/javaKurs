package gestbook.ui;


public abstract class Command {
    abstract void execute() throws ExpectedExitException, UnExpectedExitException;
}
