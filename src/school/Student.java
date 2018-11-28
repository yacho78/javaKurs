package school;

public class Student extends Person {
    public float srednia;

    public void printSrednia(){
        System.out.println("Mam średnią");
    }


    public Student(String name, String surname,float sr){
        super(name,surname);

        srednia=sr;
    }

    @Override
    public String toString() {
        return super.toString() +": srednia"+ srednia;
    }
}
