import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> h = new TreeSet<>();
        for (int i=0; i<10; i++) {
            h.add(i);
        }
        Iterator<Integer> it = h.descendingIterator();
        while(it.hasNext())
            System.out.print(it.next());
        System.out.println("\n" + h.lower(4));
        System.out.println(h.higher(4));
    }
}
