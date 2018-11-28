package school;

import java.util.*;

public class Szkola {
    private String nazwa;
    private String patron;
    public Map<String, Set<Student>> klasy=new HashMap<>();
    List<Teacher> nauczyciele = new ArrayList<>();

    public void addTeacher(Teacher t){
        nauczyciele.add(t);
    }
    public void removeTeacher(Teacher t){
        nauczyciele.remove(t);
    }


    public void addStudent(Student who, String nazwaKlasy) {
        Set<Student> uczniowie = klasy.get(nazwaKlasy);
        if (uczniowie == null) {
            uczniowie = new HashSet<>();
            klasy.put(nazwaKlasy, uczniowie);
        }
        uczniowie.add(who);
    }

    public Szkola(String nazwa, String patron) {
        this.nazwa = nazwa;
        this.patron = patron;
    }

    @Override
    public String toString() {
        return "Szkola{\n" +
                "nazwa='" + nazwa + '\'' +
                "\npatron='" + patron + '\'' +
                "\nklasy=" + klasy +
                "\nnauczyciele=" + nauczyciele +
                '}';
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getPatron() {
        return patron;
    }

    public void setPatron(String patron) {
        this.patron = patron;
    }
}
