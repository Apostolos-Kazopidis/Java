import java.util.ArrayList;

public class Demo {
    public static void print(ArrayList<Number> al) {
        ArrayList<String > sl = new ArrayList<>();
        for (var elem: al) {
            sl.add(elem.toString());
        }
        System.out.println(String.join(", ", sl));
    }
}
