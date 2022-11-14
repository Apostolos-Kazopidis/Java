import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> h = new TreeSet<>();
        h.add(7);
        h.add(9);
        h.add(3); h.add(3);
        System.out.println(h);
        h.add(4);
        System.out.println(h);
        h.remove(4);
        for (var v: h)
            System.out.println(v);

        System.out.println();
        System.out.println();

        HashSet<Integer> b = new HashSet<>();
        b.add(5);
        b.add(2);
        b.add(7); b.add(1);
        System.out.println(b);
        b.add(4);
        System.out.println(b);
        b.remove(4);
        for (var v: b)
            System.out.println(v);


    }
}
