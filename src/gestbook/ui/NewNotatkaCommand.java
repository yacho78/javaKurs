package gestbook.ui;

import gestbook.Gosc;
import gestbook.Notatka;
import gestbook.repozytory.NotatkaRepozytory;

import java.util.Scanner;

class NewNotatkaCommand extends Command {
    private NotatkaRepozytory listaNotatek;
    Scanner input;
    public NewNotatkaCommand(NotatkaRepozytory listaNotatek, Scanner input) {
        this.listaNotatek = listaNotatek;
        this.input = input;
    }

    @Override
    public void execute() {
        //Scanner input = new Scanner(System.in);
        System.out.println("Wprowadzanie:");
        String goscImie, goscNazwisko, goscEmail;
        System.out.println("Imię:");
        goscImie = input.nextLine();
        System.out.println("Nazwisko:");
        goscNazwisko = input.nextLine();
        System.out.println("email:");
        goscEmail = input.nextLine();
        Gosc gosc = new Gosc(goscImie, goscNazwisko, goscEmail);
        System.out.println("podaj tresc notatki");
        String tresc = input.nextLine().trim();
        listaNotatek.addNototaka(new Notatka(tresc, gosc));
    }
}
