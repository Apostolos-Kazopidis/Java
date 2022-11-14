import java.util.ArrayList;
public class Utils {
    static void apply(ArrayList<Integer> al, IntFunc ob) {
        for(int i=0; i<al.size(); i++) {
            al.set(i,ob.func(al.get(i)));
        }
    }
}
