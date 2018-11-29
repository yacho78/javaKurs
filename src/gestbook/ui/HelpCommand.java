package gestbook.ui;

class HelpCommand extends Command {
    @Override
    public void execute() {
        System.out.println("witaj w ćwiczeniu");
        System.out.println("Co chcesz zrobić ?");
        System.out.println("U-usun;");
        System.out.println("N-nowy");
        System.out.println("S-zapis");
        System.out.println("L-lista");
        System.out.println("Q-wyjście");
    }
}
