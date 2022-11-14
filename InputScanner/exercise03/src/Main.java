import java.util.Locale;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        Snack snack = new Snack();

        snack.read(sc);

        System.out.println(snack);

        TropicalFruit tf = new TropicalFruit();

        tf.read(sc);

        System.out.println(tf);

        sc.close();
    }
}
