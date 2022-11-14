import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Integer> ts = new TreeSet<>(new IntegerComparator());

        ts.add(5);
        ts.add(4);
        ts.add(3);
        ts.add(6);
        ts.add(2);

        System.out.println(ts);






    }
}