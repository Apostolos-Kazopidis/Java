import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> h = new TreeSet<>();
        for (int i=0; i<10; i++) {
            h.add(i);
        }
        System.out.println(h.first());
        System.out.println(h.last());
        System.out.println(h.headSet(5));
        System.out.println(h.subSet(5,7));
        System.out.println(h.tailSet(5));
    }
}
