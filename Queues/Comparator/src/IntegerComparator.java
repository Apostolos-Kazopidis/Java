import java.util.Comparator;

public class IntegerComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2.compareTo(o1); //Kata fthinousa seira 4 3 2 1 //an evaze o1 kai meta o2 tote tha itan aujousa 1 2 3 4
    }
}
