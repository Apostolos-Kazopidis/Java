import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<Integer>();
        ar.add(5);
        ar.add(2);
        ar.add(3);
        System.out.println(ar);
        ar.set(2, 6);
        ar.remove(0);
        System.out.println(ar);
        for (var v: ar)
            System.out.println(v);
    }
}
