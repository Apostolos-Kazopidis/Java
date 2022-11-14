import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Number> hs = Set.of(1, 1.1, 1.2, 1.3);

        System.out.println(hs + " " + hs.getClass());
    }
}
