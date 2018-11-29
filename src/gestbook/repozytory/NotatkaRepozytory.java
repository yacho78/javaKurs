package gestbook.repozytory;

import gestbook.Notatka;

import java.util.List;

public interface NotatkaRepozytory {
    void addNototaka(Notatka notatka);

    void removeNotatka(Notatka notatka);
    void removeNotatka(Long id);
    List<Notatka> getAll();
}
