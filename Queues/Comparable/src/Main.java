import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<MyClass> p = new PriorityQueue<>();
        p.add(new MyClass("A", 1));
        p.add(new MyClass("B", 3));
        p.add(new MyClass("C", 2));
        p.add(new MyClass("D", 4));
        for (int i=0; i<4; i++)
            System.out.println("elem removed: " + p.remove());
    }
}

