package gestbook.ui;



class ExitCommand extends Command {
    @Override
    public void execute() throws ExpectedExitException {
        throw new ExpectedExitException("Koniec");
    }
}
