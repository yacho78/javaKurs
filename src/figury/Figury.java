package figury;

import java.util.Arrays;
import java.util.List;

public class Figury {
    public static void main(String[] args) {
        Prostokat p = new Prostokat(2, 4);

        Kwadrat k = new Kwadrat(5);
        List<Figurable> f = Arrays.asList(p, k);
//
        for (Figurable ff : f) {
            System.out.println(ff);
            System.out.println("Pole : " + ff.obliczPole());
            System.out.println("Obwód : " + ff.obliczObwod());
        }


    }
}
