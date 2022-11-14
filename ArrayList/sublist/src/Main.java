import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        for (int i=1; i<=10; i++)
            al.add(i);

        Integer[] arInt = new Integer[al.size()];
        al.toArray(arInt);
        for (var i: arInt) System.out.print(i + " ");

        System.out.println();
        Object[] obInt = al.toArray();
        for (var i: obInt) System.out.print(i + " ");

        System.out.println();
        List<Integer> sl = al.subList(3, 7);
        for (var i: sl) System.out.print(i + " ");

        sl.set(0, 7);
        System.out.println(sl + " " + al);
    }
}
