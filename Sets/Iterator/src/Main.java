import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> hs = new ArrayList<>();

        for (int i=0; i<10; i++)
            hs.add("elem" + i);
        System.out.println(hs);

        // try to remove during a for each loop
        try {
            int i = 0;
            for (var elem : hs) {
                if (i % 3 == 0)
                    hs.remove(elem);
                i++;
            }
        } catch(Exception e) {
            System.out.println("Error: " + e);
        }
        System.out.println(hs);

        // do the same with an iterator
        hs.clear();
        for (int i=0; i<10; i++)
            hs.add("elem" + i);
        System.out.println(hs);

        // with the iterator it works!
        Iterator<String> it = hs.iterator();
        int i=0;
        while (it.hasNext()) {
            System.out.println(it.next());
            if (i % 3 == 0)
                it.remove();
            i++;
        }
        System.out.println(hs);

    }
}
