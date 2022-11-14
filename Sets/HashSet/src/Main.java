import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> h = new HashSet<>();
        h.add(3);
        h.add(2);
        h.add(1); h.add(1);
        System.out.println(h);
        h.add(4);
        System.out.println(h);
        h.remove(4);
        for (var v: h)
            System.out.println(v);
    }
}
