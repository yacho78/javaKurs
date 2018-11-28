package school;

public class TestSzkola {
    public static void main(String[] args) {
        Szkola s = new Szkola("szkola podstawowa nr 1", "Paderewski");
        s.addStudent(new Student("jan", "kowalski", 2.3f), "druga");
        s.addStudent(new Student("Darek", "kowalski", 4.3f), "trzecia");
        s.addStudent(new Student("Andrzej", "kowalski", 3.3f), "trzecia");
        s.addStudent(new Student("Kasia", "kowalski", 5.3f), "trzecia");
        s.addTeacher(new Teacher("imie" , "nazw","przed"));
        System.out.println(s);
        //test
    }
}
