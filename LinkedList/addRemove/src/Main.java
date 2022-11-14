import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("one");
        al.add(0, "zero");
        al.addAll(al);
        System.out.println(al);
        al.remove(0);
        al.remove("one");
        al.add("two");
        al.add("two");
        System.out.println(al);
        ArrayList<String> rem = new ArrayList<>();
        rem.add("two");
        al.removeAll(rem);
        System.out.println(al);
    }
}
