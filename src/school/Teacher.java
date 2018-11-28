package school;

public class Teacher extends Person {
    public String przedmiot;
    public Teacher(String name, String surname,String przedmiot) {
        super(name, surname);
        this.przedmiot =przedmiot;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "przedmiot='" + przedmiot + '\'' +super.toString() +
                '}';
    }
}
