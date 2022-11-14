import java.util.Comparator;

public class IntegerComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return Integer.compare(o2, o1);
        //return o2.compareTo(o1);
    }
}
