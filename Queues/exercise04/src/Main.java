import java.util.*;

public class Main {

    public static String binary(int number) {
        ArrayDeque<Integer> st = new ArrayDeque<>();

        while (number>0) {
            st.push(number % 2);
            number = number / 2;
        }

        ArrayList<String> res = new ArrayList<>();
        while (!st.isEmpty()) {
            res.add(st.pop().toString());
        }

        return String.join("",res);
    }

    public static void main(String[] args) {
        for (int i=0; i<200; i++) {
            System.out.printf("%3d: %s\n", i, binary(i));
        }
    }
}
