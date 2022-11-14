import java.util.ArrayList;
public class ArrayListAux {
    public static <T> ArrayList<T> toArrayList(T[] array) {
        ArrayList<T> al = new ArrayList<>();
        for (var elem: array)
            al.add(elem);

        return al;
    }
}
