package figury;

public interface Figurable extends Obwodable,Polable {

    @Override
    default float obliczObwod() {
        return 0;
    }

    @Override
    default float obliczPole() {
        return 0;
    }
}
