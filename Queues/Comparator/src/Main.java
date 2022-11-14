import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> p = new PriorityQueue<>(new IntegerComparator());
        p.add(3);
        p.add(2);
        p.add(1);
        System.out.println("careful, it's a heap: " + p);
        p.add(4);
        System.out.println("elem removed: " + p.remove());
        for (var v: p)
            System.out.println(v);
    }
}

