import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> p = new PriorityQueue<>();
        p.add(3); // 3
        p.add(2); // 2 3
        p.add(1); // 1 2 3
        System.out.println("careful, it's a heap: " + p);
        p.add(4); // 1 2 3 4
        System.out.println("elem removed: " + p.remove()); // 2 3 4
        for (var v: p)
            System.out.println(v); // 2 3 4
    }
}

