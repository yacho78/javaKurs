package gestbook.ui;


import gestbook.repozytory.NotatkaRepozytory;

import java.util.Scanner;

class DeleteCommand extends Command {
    private NotatkaRepozytory listaNotatek;

    public DeleteCommand(NotatkaRepozytory listaNotatek, Scanner input) {
        this.listaNotatek = listaNotatek;
        this.input = input;
    }
    Scanner input;
    @Override
    public void execute() throws UnExpectedExitException {

        System.out.println("Podaj ID:");
        try {
            Long id = Long.parseLong(input.nextLine().trim());
            listaNotatek.removeNotatka(id);
        }catch (NumberFormatException e){
            new UnExpectedExitException("błedna liczba");
        }

    }
}
