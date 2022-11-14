import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        for(int i=0; i<10; i++)
            al.add(i);

        IntFunc f = (n) -> {
            int val = 1;
            for(int i=1; i<=n; i++)
                val = val * i;

            return val;
        };

        System.out.println(al);
        Utils.apply(al,f);
        System.out.println(al);
    }
}