import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        double d = 5.0;
        System.out.printf(Locale.US, "%f\n", d);
        System.out.printf("d = %f\n", d);
        System.out.printf("d = %f, d^2=%f\n", d, d*d);
        System.out.printf("d = %f, d^2=%f, d^3=%f\n", d, d*d, d*d*d);
        int i = 1;
        String s = "in";
        System.out.printf("d=%f, i=%d, s=%s\n", d, i, s);
    }
}
