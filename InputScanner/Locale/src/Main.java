import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Locale l = Locale.getDefault();

        System.out.println(l.getDisplayLanguage());
        System.out.println(l.getDisplayCountry());

        System.out.println(l.getLanguage());
        System.out.println(l.getCountry());

    }
}
