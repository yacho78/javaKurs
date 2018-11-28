import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void printFloat(float f) {
        System.out.println(f);
    }

    public static void main(String[] args) {
        do {
            System.out.print("Podaj liczbę: ");
            Scanner input = new Scanner(System.in);
            int liczba = input.nextInt();
            System.out.println("wybrano liczbę " + liczba);
            if (liczba < 10) {
                int[] tab = new int[liczba];
                for (int ii = 0; ii < tab.length; ii++) {
                    tab[ii] = ii;
                }
                for (int i : tab) {
                    System.out.println("liczba :" + i);
                }
            } else {
                for (int i = liczba; i > 0; i--) {
                    System.out.println("liczba :" + (i - 1));
                }
            }
//            System.out.println("czy kontynuować [T/N]");
//            switch (input.next()) {
//                case"T":
//                    break;
//                    default:
//            }
//            }

            input.close();
        }while (true);

    }
}
