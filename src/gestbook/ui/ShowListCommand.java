package gestbook.ui;

import gestbook.Notatka;
import gestbook.repozytory.NotatkaRepozytory;
import gestbook.ui.Command;

class ShowListCommand extends Command {
    private NotatkaRepozytory listaNotatek;

    public ShowListCommand(NotatkaRepozytory listaNotatek) {
        this.listaNotatek = listaNotatek;
    }

    @Override
    public void execute() {
        for (Notatka n : listaNotatek.getAll()) {
            System.out.println(n);
        }
    }
}
