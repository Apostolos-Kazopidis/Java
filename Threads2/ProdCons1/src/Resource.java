import java.util.ArrayList;

public class Resource {
    private ArrayList<Integer> al;

    public Resource() {
        al = new ArrayList<>();
    }

    public synchronized void add(int elem) {
        Thread t = Thread.currentThread();

        try {
            Thread.sleep(2000);
            System.out.println("\n" + t + " added data: " + elem);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        al.add(elem);
        notify();
    }

    public synchronized int remove() throws InterruptedException {
        Thread t = Thread.currentThread();

        if (al.isEmpty()) {
            System.out.println( t + " is waiting...");
            wait(); // throws InterruptedException
        }

        int elem = al.remove(0);

        System.out.println(t + " removed data: " + elem);

        return elem;
    }

    @Override
    public String toString() {
        return al.toString();
    }
}
