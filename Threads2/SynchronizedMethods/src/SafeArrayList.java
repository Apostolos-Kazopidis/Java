import java.util.ArrayList;

public class SafeArrayList {
    private ArrayList<Integer> al;

    public SafeArrayList() {
        al = new ArrayList<>();
    }

    public synchronized void add(int elem) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        al.add(elem);
        System.out.println(this);
    }

    @Override
    public String toString() {
        return al.toString();
    }
}
