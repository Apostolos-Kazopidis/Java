import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>(1000);

        for(int i=1; i<=1000; i++)
            al.add(i);

        ArrayList<Integer>  al2 = new ArrayList<>(500);

        for(int i=2; i<=1000; i++) {
            if(i%2==0)
                al2.add(i);
        }

        al.removeAll(al2);
        System.out.println(al);





    }
}