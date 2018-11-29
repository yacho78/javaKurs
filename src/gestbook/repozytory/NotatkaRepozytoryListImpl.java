package gestbook.repozytory;

import gestbook.Gosc;
import gestbook.Notatka;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NotatkaRepozytoryListImpl implements NotatkaRepozytory {

    private List<Notatka> listaNotatek;

    public NotatkaRepozytoryListImpl() {
        this.listaNotatek = new ArrayList<>();
        Notatka n = new Notatka("tu byłem", new Gosc("imie", "Nazwisko", "Email@email.com"));
        this.addNototaka(n);
        n = new Notatka("tu byłem", new Gosc("imie", "Nazwisko", "Email@email.com"));
        this.addNototaka(n);
    }

    @Override
    public void addNototaka(Notatka notatka) {

        notatka.setId(1l);

        for (Notatka n : listaNotatek) {
            if (notatka.getId() <= n.getId()) {
                notatka.setId(n.getId() + 1);
            }
        }
        listaNotatek.add(notatka);
    }

    @Override
    public void removeNotatka(Notatka notatka) {
        //listaNotatek.remove(notatka);
        //wersja z predykatem - stare już nie używamy
//        listaNotatek.removeIf(new Predicate<Notatka>() {
//            @Override
//            public boolean test(Notatka curentNotatka) {
//                return curentNotatka.equals(notatka);
//            }
//        });
        listaNotatek.removeIf(curentNotatka -> curentNotatka.equals(notatka));

    }

    public void removeNotatka(Long id) {

        listaNotatek.removeIf(curentNotatka -> curentNotatka.getId().equals(id));

    }

    @Override
    public List<Notatka> getAll() {
        return Collections.unmodifiableList(listaNotatek);

    }

}
