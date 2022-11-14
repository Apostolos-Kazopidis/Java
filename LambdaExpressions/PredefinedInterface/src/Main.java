import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        UnaryOperator<Integer> f = (n)->n/2;
        System.out.println(f.apply(2));

        UnaryOperator<Double> d = (n)->n/2;
        System.out.println(d.apply(5.0));
    }
}
