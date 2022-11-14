import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Give a float(GR): ");
        float f = sc.nextFloat();
        System.out.println("f=" + f);

        sc.useLocale(Locale.US);
        System.out.print("Give a float(US): ");
        f = sc.nextFloat();
        System.out.println("f=" + f);
        sc.close();
    }
}
