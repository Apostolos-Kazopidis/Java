import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Number> al = new ArrayList<>();
        al.add(5); al.add(3); al.add(2.2);
        Demo.print(al);

        ArrayList<Integer> al2 = new ArrayList<>();
        al2.add(1); al2.add(2); al2.add(3);
        Demo.print(al2);
    }
}
