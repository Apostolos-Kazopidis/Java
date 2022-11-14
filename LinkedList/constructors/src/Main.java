import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Number> al = new ArrayList<>();
        al.add(4);
        al.add(5.2);
        ArrayList<Number> al2 = new ArrayList<>(al);
        al2.add(3);
        System.out.println(al + " " + al2);
    }
}
