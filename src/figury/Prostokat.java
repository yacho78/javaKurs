package figury;

public class Prostokat implements Figurable {
    public Prostokat(int a, int b) {
        this.a = a;
        this.b = b;
    }

    private int a;
    private int b;

    @Override
    public float obliczObwod() {
        return 2*(a+b) ;
    }

    @Override
    public float obliczPole() {
        return a*b;
    }

    @Override
    public String toString() {
        return "Prostokat{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
