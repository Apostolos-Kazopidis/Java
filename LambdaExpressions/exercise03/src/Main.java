import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(4);
        al.add(5);

        IntFunc f = (n)-> {
            int val=1;
            for (int i=1; i<=n ; i++)
                val*=i;
            return val;
        };
        System.out.println(al);
        Utils.apply(al, f);
        System.out.println(al);
        Utils.apply(al, (n)->n/2);
        System.out.println(al);
    }
}

