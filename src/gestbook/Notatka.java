package gestbook;

import java.time.LocalDate;
import java.util.Objects;

public class Notatka {
    public Notatka(String tresc, Gosc gosc) {
        this.tresc = tresc;
        this.gosc = gosc;
        this.dataDodania = LocalDate.now();
    }

    private Long id;
    String tresc;
    LocalDate dataDodania;
    Gosc gosc;

    public void setId(Long id) {
        this.id = id;
    }


    public Long getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notatka notatka = (Notatka) o;
        return id == notatka.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Notatka{" +
                "id=" + id +
                ", tresc='" + tresc + '\'' +
                ", dataDodania=" + dataDodania +
                ", gosc=" + gosc +
                '}';
    }
}
