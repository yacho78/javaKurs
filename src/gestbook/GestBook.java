package gestbook;

import gestbook.repozytory.*;

import gestbook.ui.UiControler;

public class GestBook {
    public static void main(String[] args) {
        System.out.println("Książka gości v. 1.0");
        NotatkaRepozytory repo = new NotatkaRepozytoryListImpl();

        UiControler ui = new UiControler(repo);
        ui.start();

    }
}


