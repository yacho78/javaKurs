package figury;

/**
 * cccc
 */
public class Kwadrat implements Figurable {
    private int a;

    public Kwadrat(int a) {
        this.a = a;
    }

    /**
     * @return ddd
     */
    @Override
    public float obliczObwod() {
        return 4* a;
    }

    @Override
    public float obliczPole() {
        return a*a;
    }

    @Override
    public String toString() {
        return "Kwadrat{" +
                "a=" + a +
                '}';
    }
}
